package com.scl.dao.impl;

import com.scl.dao.UserDao;
import com.scl.domain.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @version v1.0.0
 * @package: com.scl.dao.impl
 * @author: chenglu
 * @create: 2020/4/3
 * @desc:
 */
public class UserDaoImpl implements UserDao {
    /**
     * 登录方法
     *
     * @param loginId  用户Id
     * @param password 密码
     * @return {@code String}登录结果
     */
    @Override
    public User login(String loginId, String password) {
        User user = null;
        // 模拟登录
        if ("admin".equals(loginId)) {
            if ("admin".equals(password)) {
                return new User("admin", "admin", "userName");
            }
        }
        return null;
    }
}
