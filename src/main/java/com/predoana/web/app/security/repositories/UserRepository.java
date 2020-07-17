package com.predoana.web.app.security.repositories;

import com.predoana.web.app.security.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
