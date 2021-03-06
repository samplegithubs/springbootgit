package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping
    public String sayHello()
    {
        return "Welcome To CSI Pune";
    }

    @GetMapping("/services")
    public String services()
    {
        return "Software Development";
    }

    @GetMapping("/addresses")
    public String sayAddress(){
        return "Inspiria Mall Pune";
    }

    @GetMapping("/products")
    public String productServices()
    {
        return "QR Code Slutions";
    }


}
