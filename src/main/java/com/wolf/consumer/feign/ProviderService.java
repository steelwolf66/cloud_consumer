package com.wolf.consumer.feign;

import com.wolf.consumer.entity.Info;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "ztax-provider")
public interface ProviderService {

    @PostMapping(value = "/info/list")
    List<Info> getInfoList(Info info);
}
