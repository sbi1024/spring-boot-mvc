package com.example.spring_boot_mvc.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {
    @GetMapping("/session1")
    public String login(String username, String password, HttpSession session) {
        if ("uplus".equals(username) && "1234".equals(password)) {
            session.setAttribute("username", username);
        }
        return "sessionTest1";
    }
}
