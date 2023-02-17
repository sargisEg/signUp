package com.signup;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signin")
public class SignInController {

    @GetMapping("/user")
    public String user() {
        return "ok User";
    }

    @GetMapping("/admin")
    public String admin() {
        return "ok Admin";
    }
}
