package com.scl.shop.web.admin.service;

import com.scl.shop.domain.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @version v1.0.0
 * @package: com.scl.shop.web.admin.service
 * @author: chenglu
 * @create: 2020/4/4
 * @desc:
 */
public interface UserService {
    /**
     * 登录
     * @param email
     * @param password
     * @return
     */
    User login(String email,String password);
}
