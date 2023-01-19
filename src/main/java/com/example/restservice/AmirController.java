package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AmirController {

    private static final String template = "Tjena, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/amir")
    public Amir amir(@RequestParam(value = "name", defaultValue = "Amir") String name) {
        return new Amir(counter.incrementAndGet(), String.format(template, name));
    }
}
