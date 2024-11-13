package com.spring.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //기본 페이지 요청 메서드
    @GetMapping("/") // "/"주소에 들어가면 아래에 있는 index함수가 호출됨
    public String index(){
        return "index"; // =>templates 폴더의 index.html을 찾아감
    }
}
