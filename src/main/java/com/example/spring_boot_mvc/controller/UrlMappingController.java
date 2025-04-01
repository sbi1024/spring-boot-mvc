package com.example.spring_boot_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UrlMappingController {

    @RequestMapping(value = "/m1")
    public void m1() {
        System.out.println("/m1");
    }

    @RequestMapping(value = "/m2", method = RequestMethod.GET)
    public void m2() {
        System.out.println("/m2");
    }

    @RequestMapping(value = "/m3", method = RequestMethod.POST)
    public void m3() {
        System.out.println("/m3");
    }

    @GetMapping("/m4")
    public void m4() {
        System.out.println("/m4");
    }

    @PostMapping("/m5")
    public void m5() {
        System.out.println("/m5");
    }

    @GetMapping("/books/{bookId}")
    public void m6(@PathVariable int bookId) {
        System.out.println("/m6 " + bookId);
    }

    @GetMapping("/list/{limit}/and/{offset}")
    public void m7(@PathVariable int limit, @PathVariable int offset) {
        System.out.println("/m7 " + limit + " and " + offset);
    }
}
