package com.example.demo11.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {
    @GetMapping(value = "/home")
    public ResponseEntity<User> home(){
        User user = new User();
        user.setName("David");
        return ResponseEntity.ok(user);
    }
}
