package com.scl.shop.web.admin.service.impl;

import com.scl.shop.domain.User;
import com.scl.shop.web.admin.dao.UserDao;
import com.scl.shop.web.admin.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @version v1.0.0
 * @package: com.scl.shop.web.admin.service.impl
 * @author: chenglu
 * @create: 2020/4/4
 * @desc: 业务逻辑
 */
@Controller
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 登录
     *
     * @param email
     * @param password
     * @return
     */
    @Override
    public User login(String email, String password) {
        return userDao.getUser(email, password);
    }
}
