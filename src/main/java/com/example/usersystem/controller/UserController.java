package com.example.usersystem.controller;

import com.example.usersystem.entity.User;
import com.example.usersystem.enums.Country;
import com.example.usersystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-api/v1")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Получить всех пользователей
     * GET /user-api/v1/users
     */
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    /**
     * Добавить нового пользователя
     * POST /user-api/v1/users
     */
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    /**
     * Получить пользователей НЕ из указанной страны, отсортированных по возрасту
     * GET /user-api/v1/additional-info?country={COUNTRY}
     */
    @GetMapping("/additional-info")
    public ResponseEntity<List<User>> getUsersNotFromCountry(@RequestParam("country") Country country) {
        List<User> users = userService.getUsersNotFromCountry(country);
        return ResponseEntity.ok(users);
    }
} 