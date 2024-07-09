package com.example.employee.Service;

import com.example.employee.Repository.UserRepository;
import com.example.employee.Model.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(long id, User userDetails) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setUserName(userDetails.getUserName());
            user.setEmail(userDetails.getEmail());
            user.setAddress(userDetails.getAddress());
            user.setNumber(userDetails.getNumber());
            user.setRoll(userDetails.getRoll());
            user.setStatus(userDetails.getStatus());
            user.setCrateDate(userDetails.getCrateDate());
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
