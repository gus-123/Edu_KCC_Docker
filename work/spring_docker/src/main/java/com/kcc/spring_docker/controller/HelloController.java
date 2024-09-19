package com.kcc.spring_docker.controller;

import com.kcc.spring_docker.service.MemberService;
import com.kcc.spring_docker.vo.MemberVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final MemberService memberService;

    public HelloController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Docker2";
    }

    @GetMapping("/members")
    public List<MemberVO> findAllMembers() {
        return memberService.selectAllMembers();
    }
}
