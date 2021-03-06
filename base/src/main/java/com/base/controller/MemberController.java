package com.base.controller;


import com.base.beans.Member;
import com.base.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YangBo
 * @since 2019-12-02
 */
@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "one", method = RequestMethod.GET)
    public String one(HttpServletRequest request, HttpServletResponse response, Model model) {
        Member member = memberService.getById(1);
        model.addAttribute("member", member);
        return "test";
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(HttpServletRequest request, HttpServletResponse response, Model model) {

        List<Member> list = memberService.list();
        model.addAttribute("list", list);
        return "list";
    }
}

