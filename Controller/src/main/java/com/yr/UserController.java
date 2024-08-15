package com.yr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping(value = "/test")
    public void query() {
        userService.query();
    }
}
