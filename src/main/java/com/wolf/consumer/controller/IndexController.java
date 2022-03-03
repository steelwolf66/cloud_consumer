package com.wolf.consumer.controller;

import com.wolf.consumer.service.HelloFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private HelloFeignService feignService;

    @GetMapping(value = "/hello")
    public String hello() {
        logger.info("consumer method : hello");
        return feignService.hello();
    }
    @GetMapping(value = "/bad")
    public String badRequest() {
        logger.info("consumer method : badRequest");
        return feignService.bad();
    }
}