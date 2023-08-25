package com.cybersoft.demospringboot02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Annotation định nghĩa đường dẫn
 * @Controller: Định nghĩa đường đãn được dùng để trả ra nội dung html
 * @ResponseBody: Trả nội dung kiểu String
 * @RestController: Định nghĩa đường dẫn, nội dung trả về String chuyên dùng để viết API
 */

// /hello, /hello/cybersoft
@RestController
@RequestMapping("/hello")
public class HelloController {
    // /hello + ""  => /hello
    @GetMapping("")
    public String hello(){

        return "hello spring boot";
    }

    // /hello + "/cybersoft"  => /hello/cybersoft
    @GetMapping("/cybersoft")
    public String helloCybersoft(){
        return "Hello Cybersoft";
    }
}
