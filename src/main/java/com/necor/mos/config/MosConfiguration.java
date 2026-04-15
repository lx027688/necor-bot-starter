package com.necor.mos.config;

import com.necor.mos.client.MosClient;
import com.necor.mos.client.MosClientFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MosProperties.class)
public class MosConfiguration {

    @Value("${necor.mos.active}")
    private String active;

    private final MosProperties properties;

    public MosConfiguration(MosProperties properties) {
        this.properties = properties;
    }

    @Bean
    public MosClient mosClient() {
        MosProperties.ClientProperties clientProperties = properties.getClient().get(active);
        if (clientProperties == null) {
            throw new IllegalArgumentException("Configuration not found for active: " + active);
        }
        return MosClientFactory.getClient(active, clientProperties);
    }
}
