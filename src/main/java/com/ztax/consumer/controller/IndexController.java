package com.ztax.consumer.controller;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import com.ztax.common.constants.AuthConstants;
import com.ztax.common.result.Result;
import com.ztax.common.utils.HttpUtils;
import com.ztax.common.utils.WebUtils;
import com.ztax.feign.entity.Info;
import com.ztax.feign.service.HelloFeignService;
import com.ztax.feign.service.ProviderService;
import com.ztax.feign.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
@AllArgsConstructor
@Slf4j
public class IndexController {

    private HelloFeignService feignService;

    private ProviderService providerService;

    private UserService userService;

    @GetMapping(value = "/hello")
    public String hello() {
        HttpServletRequest httpServletRequest = WebUtils.getHttpServletRequest();
        log.info("http request:{}", httpServletRequest.toString());
        log.info("consumer method : hello");
        return feignService.hello();
    }

    @GetMapping(value = "/bad")
    public String badRequest() {
        log.info("consumer method : badRequest");
        return feignService.bad();
    }

    @PostMapping(value = "/info/list")
    public List<Info> getListInfo(@RequestBody Info info) {
        List<Info> resultList = providerService.getInfoList(info);
        return resultList;
    }

    @GetMapping(value = "/users/me")
    public Result currentUserInfo() {
        String jwtPayload = HttpUtils.getRequest().getHeader(AuthConstants.JWT_PAYLOAD_KEY);
        JSONObject jsonObject = JSONUtil.parseObj(jwtPayload);
        log.info("jsonpayload :{}", jsonObject);
        return userService.currentUserInfo();
    }
}