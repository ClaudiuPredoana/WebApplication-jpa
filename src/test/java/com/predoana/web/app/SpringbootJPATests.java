package com.predoana.web.app;

import com.predoana.web.app.entity.User;
import com.predoana.web.app.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SpringbootJPATests {


    @Autowired
    private UserRepository userRepository;

    @Test
    public void findAllUsers()  {
        List<User> users = userRepository.findAll();
        assertNotNull(users);
        assertTrue(!users.isEmpty());
    }
    @Test
    public void findUserById()  {
        Optional<User> user = userRepository.findById(1);
        assertNotNull(user.get());    }
    @Test
    public void createUser() {
        User user = new User(null, "Paul", "paul@gmail.com");
        User savedUser = userRepository.save(user);
        User newUser = userRepository.findById(savedUser.getId()).get();
        assertEquals("SivaPrasad", newUser.getName());
        assertEquals("sivaprasad@gmail.com", newUser.getEmail());
    }
}

