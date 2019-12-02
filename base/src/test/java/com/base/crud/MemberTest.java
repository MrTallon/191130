package com.base.crud;

import com.base.beans.Member;
import com.base.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author yangbo
 * @version v1.0.0
 * @date 2019-12-02 22:45
 */
@SpringBootTest
class MemberTest {
    @Autowired
    private MemberService service;

    @Test
    void select1() {
        List<Member> list = service.list();
        list.forEach(System.out::println);
    }
}
