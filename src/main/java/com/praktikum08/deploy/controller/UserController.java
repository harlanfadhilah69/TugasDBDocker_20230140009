package com.praktikum08.deploy.controller;

import com.praktikum08.deploy.model.User;
import com.praktikum08.deploy.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users") // Biasanya menggunakan huruf kecil untuk endpoint
public class UserController {

    private final UserService userService;

    // Constructor Injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    // Tambahkan @ sebelum RequestBody
    public String createUser(@RequestBody User request) {
        userService.addUser(request);
        return "user created successfully";
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    // Berikan nama method, misalnya 'deleteUser'
    public String deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return "user deleted successfully";
    }

    @PutMapping("/{id}")
    // Tambahkan @ sebelum RequestBody
    public String updateUser(@PathVariable String id, @RequestBody User request) {
        userService.updateUser(id, request);
        return "user updated successfully";
    }
}