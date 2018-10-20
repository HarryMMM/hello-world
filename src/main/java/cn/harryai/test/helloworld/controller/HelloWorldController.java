package cn.harryai.test.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping("hello")
    public String hello(){

        return "hello-world";
    }
}
