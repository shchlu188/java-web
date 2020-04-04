package com.scl.shop.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
public class MainController {
    @GetMapping("/main")
    public String main() {
        return "main";

    }
}