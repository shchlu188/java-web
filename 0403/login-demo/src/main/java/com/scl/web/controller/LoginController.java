package com.scl.web.controller;

import com.scl.domain.User;
import com.scl.service.UserService;
import com.scl.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @version v1.0.0
 * @package: com.scl.web.controller
 * @author: chenglu
 * @create: 2020/4/3
 * @desc:
 */
public class LoginController extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginId = req.getParameter("loginId");
        String password = req.getParameter("password");
        User user = userService.login(loginId, password);
        // 用户登录失败
        if (user == null) {
            req.getRequestDispatcher("/error.jsp").forward(req, resp);
            // 登录成功
        } else {
            req.getRequestDispatcher("/success.jsp").forward(req, resp);

        }
    }
}
