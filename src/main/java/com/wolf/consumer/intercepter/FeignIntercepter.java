package com.wolf.consumer.intercepter;

import com.ztax.common.constants.AuthConstants;
import com.ztax.common.utils.ObjectUtils;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
public class FeignIntercepter implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //添加token
        String token = request.getHeader(AuthConstants.JWT_TOKEN_HEADER);
        if (ObjectUtils.isNotBlank(token)) {
            requestTemplate.header(AuthConstants.JWT_TOKEN_HEADER, token);
        }
    }
}
