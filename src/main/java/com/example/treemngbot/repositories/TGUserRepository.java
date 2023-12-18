package com.example.treemngbot.repositories;

import com.example.treemngbot.model.TGUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TGUserRepository extends JpaRepository<TGUser, Long> {
    TGUser findByChatId(Long chatId);
}
