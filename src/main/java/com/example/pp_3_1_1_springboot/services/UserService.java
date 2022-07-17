package com.example.pp_3_1_1_springboot.services;

import com.example.pp_3_1_1_springboot.models.Users;
import com.example.pp_3_1_1_springboot.repository.UserRepository;
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

    public void createUser(Users user) {
        userRepository.save(user);
    }
    public void updateUser(Users user) {
        userRepository.save(user);

    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public Users getUserId(Long id) {
        return userRepository.getReferenceById(id);
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}
