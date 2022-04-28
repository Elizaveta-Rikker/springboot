package org.rikker.springboot.services;

import org.rikker.springboot.models.User;
import org.rikker.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {

    public List<User> index();


    public User show(int id);


    public void save(User user);


    public void delete(int id);
}
