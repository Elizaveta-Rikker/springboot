package org.rikker.springboot.services;


import org.rikker.springboot.models.User;
import org.rikker.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> index() {
        return userRepository.findAll();
    }


    public User show(int id) {
        return userRepository.getById(id);
    }


    public void save(User user) {
        userRepository.save(user);
    }


    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
