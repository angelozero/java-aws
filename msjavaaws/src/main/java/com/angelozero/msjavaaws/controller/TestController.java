package com.angelozero.msjavaaws.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class TestController {

    @GetMapping("/foo/{name}")
    public ResponseEntity<String> test(@PathVariable String name) {
        log.info("\nName info: {}\n", name);
        return ResponseEntity.ok(name);
    }
}
