package com.devops.microservice.controllers;

import com.devops.microservice.models.DevOps;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MainController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/devops")
    public DevOps DevOps(@RequestParam(value="name", defaultValue="World") String name) {
        return new DevOps(String.format(template, name));
    }
}
