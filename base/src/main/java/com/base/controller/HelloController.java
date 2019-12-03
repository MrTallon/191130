package com.base.controller;

import com.base.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @Autowired
    private RedisService redisService;

    @RequestMapping("/hello")
    public String hello() {
        return "My name is Json";
    }

    @RequestMapping(value = "set", method = RequestMethod.POST)
    public String put(String key, String value, int seconds) {
        redisService.set(key, value, seconds);
        return "ok";
    }

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String get(String key) {
        Object o = redisService.get(key);
        if (o != null) {
            String s = String.valueOf(o);
            return s;
        }
        return "not_ok";
    }
}
