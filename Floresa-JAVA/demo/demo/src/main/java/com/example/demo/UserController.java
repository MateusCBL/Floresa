package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping
    public User creatUser(@RequestBody User user){
        return UserRepository.save(user);
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id) {
        return UserRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
