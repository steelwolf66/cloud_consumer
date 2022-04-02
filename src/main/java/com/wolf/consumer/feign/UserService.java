package com.wolf.consumer.feign;

import com.wolf.consumer.entity.Info;
import com.wolf.consumer.entity.User;
import com.ztax.common.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "ztax-iam", contextId = "userService")
public interface UserService {

    @GetMapping(value = "/users/me")
    Result<User> currentUserInfo();
}
