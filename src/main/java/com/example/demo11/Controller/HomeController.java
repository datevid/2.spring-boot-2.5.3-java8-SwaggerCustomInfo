package com.example.demo11.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
@Api(tags = "Public home")
public class HomeController {

    @GetMapping(value = "/home")
    @ApiOperation(value = "Show home")
    public ResponseEntity<User> home(){
        User user = new User();
        user.setName("David");
        return ResponseEntity.ok(user);
    }
}
