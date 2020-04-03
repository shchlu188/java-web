package com.scl.dao;

import com.scl.domain.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @version v1.0.0
 * @package: com.scl.dao
 * @author: chenglu
 * @create: 2020/4/3
 * @desc:   用户数据访问
 */
public interface UserDao {
    /**
     * 登录方法
     * @param loginId 用户id
     * @param password 密码
     * @return 登录结果
     */
    User login(String loginId, String password);
}
