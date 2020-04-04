package com.scl.shop.web.admin.dao.impl;

import com.scl.shop.domain.User;
import com.scl.shop.web.admin.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;



/**
 * Created with IntelliJ IDEA.
 *
 * @version v1.0.0
 * @package: com.scl.shop.web.admin.dao.impl
 * @author: chenglu
 * @create: 2020/4/4
 * @desc:
 */
@Repository
public class UserDaoImpl implements UserDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);

    /**
     * 根据邮箱和密码获取用户信息
     *
     * @param email
     * @param password
     * @return
     */
    @Override
    public User getUser(String email, String password) {
        LOGGER.debug("调用getUser()...");
        User user = null;
        if ("scl@163.com".equals(email)) {
            if ("admin".equals(password)) {
                user = new User();
                user.setEmail(email);
                user.setUsername("admin");
            }
        } else {
            LOGGER.error("登录失败");
        }
        return user;
    }
}






