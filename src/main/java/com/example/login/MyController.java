package com.example.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String hello() {
        return ("<h1>Hello everyone</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Hello User</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Hello Admin</h1>");
    }
}
