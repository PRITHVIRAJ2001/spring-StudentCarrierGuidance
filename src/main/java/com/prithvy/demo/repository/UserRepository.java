package com.prithvy.demo.repository;

import com.prithvy.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmailAndPassword(String username, String password);

    User findByEmail(String email);

}
