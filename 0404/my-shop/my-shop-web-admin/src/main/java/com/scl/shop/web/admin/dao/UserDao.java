package com.scl.shop.web.admin.dao;

import com.scl.shop.domain.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @version v1.0.0
 * @package: com.scl.shop.web.admin.dao
 * @author: chenglu
 * @create: 2020/4/4
 * @desc:
 */
public interface UserDao {
    /**
     * 根据邮箱和密码获取用户信息
     * @param email
     * @param password
     * @return
     */
    User getUser(String email,String password);
}
