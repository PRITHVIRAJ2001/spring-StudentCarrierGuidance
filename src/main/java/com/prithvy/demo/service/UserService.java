package com.prithvy.demo.service;

import com.prithvy.demo.model.User;
import com.prithvy.demo.repository.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Component
public class UserService {


    @Autowired
    private UserRepository repo;

    public UserService()
    {

    }
    public UserService(UserRepository repo) {
        super();
        this.repo = repo;
    }


    public void saveMyUser(User user) {
        repo.save(user);
//        repo.insert(user);
    }

    public User findByEmailAndPassword(String email, String password) {
        return repo.findByEmailAndPassword(email, password);
    }

}
