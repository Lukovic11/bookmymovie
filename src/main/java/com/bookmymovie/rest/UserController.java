package com.bookmymovie.rest;

import com.bookmymovie.dto.UserDTO;
import com.bookmymovie.entity.User;
import com.bookmymovie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@Transactional
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<UserDTO> findAll(){
        return userService.findAll();
    }

    @GetMapping("/byId/{id}")
    public UserDTO findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }

}
