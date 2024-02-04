package com.securpro.basic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicDataController {
    @GetMapping("/public-data")
    public String getPublicData() {
        return "This is public data available for all authenticated users.";
    }
}