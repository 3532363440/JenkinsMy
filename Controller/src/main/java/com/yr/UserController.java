package com.yr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping(value = "/test")
    public void query() {
        System.out.println("你好");
    }
}
