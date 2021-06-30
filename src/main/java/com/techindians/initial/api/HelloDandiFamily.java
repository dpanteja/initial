package com.techindians.initial.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDandiFamily {
    @GetMapping(value = "/wish")
    public ResponseEntity<String> getWishFulfilled(@RequestParam(value = "name") String name){
        return new ResponseEntity<>("Your wish will be fulfilled " + name, HttpStatus.OK);
    }
}
