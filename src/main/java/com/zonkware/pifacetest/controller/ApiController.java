package com.zonkware.pifacetest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/PATH")
    public String test() {
        return "GOT IT!";
    }

    @RequestMapping("/PATH2")
    public String test2() {
        return "GOT IT AGAIN!";
    }

    @RequestMapping("/PATH3")
    public String test3() {
        return "STILL GOT IT!";
    }

}
