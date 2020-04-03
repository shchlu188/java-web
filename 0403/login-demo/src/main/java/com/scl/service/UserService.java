package com.scl.service;

import com.scl.domain.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @version v1.0.0
 * @package: com.scl.service
 * @author: chenglu
 * @create: 2020/4/3
 * @desc:
 */
public interface UserService {
    /**
     *  登录
     * @param loginId 用户id
     * @param password 密码
     * @return 登录结果
     */
    User login(String loginId,String password);
}
