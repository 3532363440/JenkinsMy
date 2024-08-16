package com.yr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping(value = "/test")
    public void query() {
        User user = new User();
        user.setId(1);
        user.setName("liu");
        user.setAddr("aaaa");
        System.out.println(user.toString());
    }
}
