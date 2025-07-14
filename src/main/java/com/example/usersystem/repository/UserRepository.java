package com.example.usersystem.repository;

import com.example.usersystem.entity.User;
import com.example.usersystem.enums.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Находим пользователей НЕ из указанной страны, отсортированных по возрасту
    @Query("SELECT u FROM User u WHERE u.country <> :country ORDER BY u.age ASC")
    List<User> findByCountryNotOrderByAgeAsc(@Param("country") Country country);
} 