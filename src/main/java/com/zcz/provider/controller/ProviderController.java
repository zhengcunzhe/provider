package com.zcz.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProviderController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world!1";
    }

}
