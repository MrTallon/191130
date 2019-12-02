package com.base.jUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * 测试请求
 * @author yangbo
 * @version v1.0.0
 * @date 2019-12-02 23:18
 * https://www.jianshu.com/p/8b0425d4d8a0
 */
class RequestTest {

    private RestTemplate template = new RestTemplate();

    @Test
    @DisplayName("测试get请求")
    void get(){
        for (int i = 0; i < 2000; i++) {
            //https://www.baidu.com/
            String url = "http://localhost:" + 8085 + "/hello";
            String result = template.getForObject(url, String.class);
            assertEquals(result, "My name is Json");
        }
    }

    @Test
    @DisplayName("测试post请求")
    void post(){
//        MultiValueMap multiValueMap = new LinkedMultiValueMap();
//        multiValueMap.add("username","Java技术栈");
//        ActResult result = testRestTemplate.postForObject("/test/post",multiValueMap,ActResult.class);
//        assertEquals(result.getCode(),0);
    }
}
