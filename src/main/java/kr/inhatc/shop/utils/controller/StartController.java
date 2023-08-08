package kr.inhatc.shop.utils.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @GetMapping(value = "/")
    public String hello(){
        return "Hello, World! 123";
    }
}
