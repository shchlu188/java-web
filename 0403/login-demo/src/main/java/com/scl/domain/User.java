package com.scl.domain;

/**
 * Created with IntelliJ IDEA.
 *
 * @version v1.0.0
 * @package: com.scl.domain
 * @author: chenglu
 * @create: 2020/4/3
 * @desc: 用户表
 */
public class User {
    private String username;
    private String loginId;
    private String loginPwd;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", loginId='" + loginId + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                '}';
    }

    public User() {
    }

    public User(String username, String loginId, String loginPwd) {
        this.username = username;
        this.loginId = loginId;
        this.loginPwd = loginPwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }
}
