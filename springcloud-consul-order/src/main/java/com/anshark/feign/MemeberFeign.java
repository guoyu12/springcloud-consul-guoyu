package com.anshark.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author GUOYU
 * @Date 2021/1/18
 * @Desc
 */
@FeignClient("consul-member")
public interface MemeberFeign {

    @RequestMapping("/member/getMember")
    String getMember();
}
