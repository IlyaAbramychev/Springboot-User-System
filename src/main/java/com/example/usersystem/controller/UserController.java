package com.example.usersystem.controller;

import com.example.usersystem.model.User;
import com.example.usersystem.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/search")
    public List<User> findUsersNotFromCountry(@RequestParam String country) {
        return userRepository.findByCountryNotOrderByAgeAsc(country);
    }
}
