package com.scl.shop.web.admin.web.controller;

import com.scl.shop.domain.User;
import com.scl.shop.web.admin.constant.ConstantUtils;
import com.scl.shop.web.admin.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @version v1.0.0
 * @package: com.scl.shop.web.admin.web.controller
 * @author: chenglu
 * @create: 2020/4/4
 * @desc:
 */
@Controller
public class LoginController {
    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({"", "login"})
    public String login() {
        return "login";
    }

    /**
     * 登录
     *
     * @param email
     * @param password
     * @param request
     * @return
     */
    @PostMapping("login")
    public String login(@RequestParam(required = true) String email,
                        @RequestParam(required = true) String password,
                        HttpServletRequest request) {

        User login = userService.login(email, password);
        // 登录失败
        if (login == null) {
            return login();
            // 登录成功
        } else {
            // 将登录信息放入会话
            request.getSession().setAttribute(ConstantUtils.SESSION_USER, login);

            return "redirect:/main";
        }
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        // session 失效
        request.getSession().invalidate();
        return login();
    }
}
