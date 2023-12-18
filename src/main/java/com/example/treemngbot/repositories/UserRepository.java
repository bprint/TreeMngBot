package com.example.treemngbot.repositories;

import com.example.treemngbot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByChatId(Long chatId);
}
