package com.saseum.myblog.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserViewController {
    @GetMapping("/login")
    public String login() {
        return "oauthLogin";
    }

    @GetMapping("/sign-up")
    public String signUp() {
        return "sign-up";
    }
}
