package com.predoana.web.app;

import com.predoana.web.app.orders.entities.Order;
import com.predoana.web.app.orders.repositories.OrderRepository;
import com.predoana.web.app.security.entities.User;
import com.predoana.web.app.security.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMultipleDSTests {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Test
    public void findAllUsers()    {
       List<User> users = userRepository.findAll();
        assertNotNull(users);
        assertTrue(!users.isEmpty());
    }
    @Test
    public void findAllOrders()    {
        List<Order> orders = orderRepository.findAll();
        assertNotNull(orders);
        assertTrue(!orders.isEmpty());
    } }
