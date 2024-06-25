package com.necor.bot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

@ConfigurationProperties(prefix = "necor")
public class BotProperties {

    private Map<String, ClientProperties> bot = new HashMap<>();


    public Map<String, ClientProperties> getBot() {
        return bot;
    }

    public void setBot(Map<String, ClientProperties> bot) {
        this.bot = bot;
    }

    public static class ClientProperties {
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

}
