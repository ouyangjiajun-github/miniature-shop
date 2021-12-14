package com.ouyang.miniature.auth.service;

import com.miniature.commonshop.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ouyang on 2019/10/18.
 */
@FeignClient("mall-admin")
public interface UmsAdminService {

    @GetMapping("/admin/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);
}
