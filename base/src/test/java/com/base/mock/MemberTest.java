package com.base.mock;

import com.base.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 * @author yangbo
 * @version v1.0.0
 * @date 2019-12-16 20:08
 */
public class MemberTest {

    @MockBean
    private MemberService service;


    @Test
    void test() {
//        BDDMockito.given()
//        given(this.service.getById()).willRe;
    }
}
