package com.prithvy.demo.service;

import com.prithvy.demo.model.User;
import com.prithvy.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class UserService {

    private UserRepository repo;

    public UserService() {

    }

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User saveMyUser(User user) {
        return repo.save(user);
    }

    public User findByEmailAndPassword(String email, String password) {
        return repo.findByEmailAndPassword(email, password);
    }

    public User findByEmail(String email) {
        return repo.findByEmail(email);
    }
}
