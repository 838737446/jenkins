package com.tao.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("jenkins")
@RestController
public class JenkinsController {

    @GetMapping("test")
    public String test(){
        return "测试jenkins1lwt";
    }
}
