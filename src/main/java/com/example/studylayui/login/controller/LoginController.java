package com.example.studylayui.login.controller;

import com.example.studylayui.utils.Result;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LoginController {

    @PostMapping("/login")

    public ResponseEntity login(@RequestBody Map<String, String> map) {


        if (map.get("username").equals("admin") && map.get("password").equals("123")) {
            return ResponseEntity.ok("成功");
        }

        return ResponseEntity.ok("失败");

    }
}
