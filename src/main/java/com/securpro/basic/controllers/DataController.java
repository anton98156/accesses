package com.securpro.basic.controllers;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    @GetMapping("/private-data")
    @PreAuthorize("hasRole('ADMIN')")
    public String getPrivateData() {
        return "This is private data for admins only.";
    }
}