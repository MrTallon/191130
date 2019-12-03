package com.base.controller;

import com.base.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "测试用例Controller")
@RestController
public class HelloController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello() {
        return "My name is Json";
    }

    @ApiOperation(value = "Redis缓存入库")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "键", required = true),
            @ApiImplicitParam(name = "value", value = "值", required = true),
            @ApiImplicitParam(name = "seconds", value = "生效时间", required = true)
    })
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
