package com.fino.gdgoc_2_railway.domain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/api/health")
    public String health() {
        return "OK";
    }
}
