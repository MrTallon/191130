package com.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试Controller
 *
 * @author yangbo
 * @version v1.0.0
 * @date 2019-12-02 22:20
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "My name is Json";
    }


}
