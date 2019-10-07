package hu.flowacademy.test.foodorder.controller;

import hu.flowacademy.test.foodorder.model.User;
import hu.flowacademy.test.foodorder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allusers")
    public ArrayList<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/oneuser")
    public User getOneUser(@RequestParam String username) {
        return userService.findOne(username);
    }

    @PostMapping("/adduser")
    public User createUser(@RequestBody User user) {
        userService.addNew(user);
        return user;
    }

    @PutMapping("/updateuser")
    public User updateUser(@RequestBody User user) {
        userService.update(user);
        return user;
    }

    @DeleteMapping("deleteuser")
    public void deleteUser(@RequestParam String username) {
        userService.delete(username);
    }
}
