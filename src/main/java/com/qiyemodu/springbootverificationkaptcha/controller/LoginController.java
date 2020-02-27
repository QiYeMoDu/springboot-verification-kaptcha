package com.qiyemodu.springbootverificationkaptcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来
 * ===========================================================
 * @date 2019/12/20 22:14
 */
@Controller
public class LoginController {

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "hello";
    }
}
