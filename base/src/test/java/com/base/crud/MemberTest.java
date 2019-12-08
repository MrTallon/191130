package com.base.crud;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.base.beans.Member;
import com.base.mapper.MemberMapper;
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

    @Autowired
    private MemberMapper mapper;

    @Test
    void select1() {
        List<Member> list = service.list();
        list.forEach(System.out::println);
    }

    @Test
    void selectOne() {
        Member member = mapper.selectOne(new Wrapper<Member>() {
            @Override
            public Member getEntity() {
                return new Member().setId(111);
            }

            @Override
            public MergeSegments getExpression() {
                return null;
            }

            @Override
            public String getSqlSegment() {
                return null;
            }
        });
        System.out.println(member);

    }
}
