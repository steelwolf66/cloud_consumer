package com.wolf.consumer.service;

import com.wolf.consumer.feign.ProviderService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ztax-iam")
public interface HelloFeignService  {
    //地址为服务提供者对外暴露的地址
    @GetMapping(value = "/hello")
    String hello();

    @GetMapping(value = "/bad")
    String bad();
}
