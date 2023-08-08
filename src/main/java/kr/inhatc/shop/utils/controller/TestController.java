package kr.inhatc.shop.utils.controller;

import kr.inhatc.shop.utils.dto.TestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/")
    public String hello(){
        return "Hello, World! 123";
    }

    @GetMapping(value = "/test")
    public TestDto test(){
        TestDto dto = TestDto.builder()
                .name("홍길동")
                .age(20)
                .build();
        return dto;
    }
}
