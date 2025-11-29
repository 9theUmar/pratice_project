package com.practice.controller;

import com.practice.dto.UserDto;
import com.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<UserDto> createOrUpdate(@RequestBody UserDto dto) {
        return ResponseEntity.ok(userService.createOrUpdate(dto));
    }
}
