package com.scl.service.impl;

import com.scl.dao.UserDao;
import com.scl.dao.impl.UserDaoImpl;
import com.scl.domain.User;
import com.scl.service.UserService;

/**
 * Created with IntelliJ IDEA.
 *
 * @version v1.0.0
 * @package: com.scl.service.impl
 * @author: chenglu
 * @create: 2020/4/3
 * @desc:
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    /**
     * 登录
     *
     * @param loginId  用户id
     * @param password 密码
     * @return 登录结果
     */
    @Override
    public User login(String loginId, String password) {
        return userDao.login(loginId, password);
    }
}
