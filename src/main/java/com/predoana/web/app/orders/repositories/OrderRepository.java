package com.predoana.web.app.orders.repositories;

import com.predoana.web.app.orders.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}