package com.ssd.assignment2.GmailService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    @RequestMapping(value="/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
