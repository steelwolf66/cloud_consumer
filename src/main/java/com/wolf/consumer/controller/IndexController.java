package com.wolf.consumer.controller;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.wolf.consumer.entity.Info;
import com.wolf.consumer.feign.ProviderService;
import com.wolf.consumer.feign.UserService;
import com.wolf.consumer.service.HelloFeignService;
import com.ztax.common.constants.AuthConstants;
import com.ztax.common.result.Result;
import com.ztax.common.utils.ApplicationContextProvider;
import com.ztax.common.utils.HttpUtils;
import com.ztax.common.utils.JwtUtils;
import com.ztax.common.utils.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class IndexController {
    Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private HelloFeignService feignService;

    @Autowired
    private ProviderService providerService;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/hello")
    public String hello() {
        HttpServletRequest httpServletRequest = WebUtils.getHttpServletRequest();
        logger.info("http request:{}", httpServletRequest.toString());
        logger.info("consumer method : hello");
        return feignService.hello();
    }

    @GetMapping(value = "/bad")
    public String badRequest() {
        logger.info("consumer method : badRequest");
        return feignService.bad();
    }

    @PostMapping(value = "/info/list")
    public List<Info> getListInfo(@RequestBody Info info) {
        List<Info> resultList = providerService.getInfoList(info);
        return resultList;
    }

    @GetMapping(value = "/users/me")
    public Result currentUserInfo() {
        String jwtPayload = HttpUtils.getResponse().getHeader(AuthConstants.JWT_PAYLOAD_KEY);
        JSONObject jsonObject = JSONUtil.parseObj(jwtPayload);
        logger.info("jsonpayload :{}", jsonObject);
        return userService.currentUserInfo();
    }
}