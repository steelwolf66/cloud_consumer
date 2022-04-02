package com.wolf.consumer.service;

import com.wolf.consumer.feign.ProviderService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//value值为Nacos中服务名，contextId可理解为feignService的别名，用来实现针对同一服务多个feignService
@FeignClient(value = "ztax-provider",contextId = "helloFeignService")
public interface HelloFeignService {
    //地址为服务提供者对外暴露的地址
    @GetMapping(value = "/hello")
    String hello();

    @GetMapping(value = "/bad")
    String bad();
}
