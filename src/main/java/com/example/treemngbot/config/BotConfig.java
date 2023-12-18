package com.example.treemngbot.config;

import com.example.treemngbot.services.TelegramBot;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("application.properties")
public class BotConfig {

        @Value("${bot.name}")
        String botName;

        @Value("${bot.token}")
        String token;

        @Value("${bot.owner}")
        Long ownerId;

        @Bean
        public TelegramBot telegramBot() {
                return new TelegramBot(token);
        }
}
