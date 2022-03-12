package com.prithvy.demo.service.Security;

import com.prithvy.demo.model.User;
import com.prithvy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Component
public class UserServiceSecurity implements UserDetailsService {

    @Autowired
    private UserService userService;

    public UserServiceSecurity(UserService userService) {
        this.userService = userService;
    }

    public UserServiceSecurity() {
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userService.findByEmail(email);
        List<GrantedAuthority> authorities = getUserAuthority(Collections.singleton("user"));
        return buildUserForAuthentication(user, authorities);
    }

    private List<GrantedAuthority> getUserAuthority(Set<String> userRoles) {
        Set<GrantedAuthority> roles = new
                HashSet<>();
        for (String role : userRoles) {
            roles.add(new
                    SimpleGrantedAuthority(
                    "user"
            ));
        }
        return new ArrayList<>(roles);
    }

    private UserDetails buildUserForAuthentication(User user, List<GrantedAuthority> authorities) {
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), true, true, true
                , true, authorities);
    }
}
