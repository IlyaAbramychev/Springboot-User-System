package com.example.usersystem.service;

import com.example.usersystem.entity.User;
import com.example.usersystem.enums.Country;
import com.example.usersystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Получить всех пользователей
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Добавить нового пользователя
     */
    public User createUser(User user) {
        return userRepository.save(user);
    }

    /**
     * Получить пользователей НЕ из указанной страны, отсортированных по возрасту
     */
    public List<User> getUsersNotFromCountry(Country country) {
        return userRepository.findByCountryNotOrderByAgeAsc(country);
    }
} 