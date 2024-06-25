package com.necor.bot.config;

import com.necor.bot.pusher.BotPusher;
import com.necor.bot.pusher.BotPusherFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@EnableConfigurationProperties(BotProperties.class)
public class BotConfiguration {
    private final BotProperties properties;

    public BotConfiguration(BotProperties properties) {
        this.properties = properties;
    }

    @Bean
    public BotPusher botPusher() {
        if (properties.getBot().size() > 1) {
            throw new IllegalStateException("Multiple BotPusher beans found: " + properties.getBot().size());
        }
        Map.Entry<String, BotProperties.ClientProperties> enset = properties.getBot().entrySet().stream().findFirst().orElse(null);
        if (enset == null) {
            return null;
        }
        return BotPusherFactory.getPusher(enset.getKey(), enset.getValue().getUrl());
    }
}
