package com.necor.mos.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

@ConfigurationProperties(prefix = "necor.mos")
public class MosProperties {

    private Map<String, ClientProperties> client = new HashMap<>();

    public Map<String, ClientProperties> getClient() {
        return client;
    }

    public void setClient(Map<String, ClientProperties> client) {
        this.client = client;
    }

    public static class ClientProperties {
        private String endpoint;
        private String region;
        private String bucket;
        private String accessKeyId;
        private String accessKeySecret;

        public String getEndpoint() {
            return endpoint;
        }

        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getBucket() {
            return bucket;
        }

        public void setBucket(String bucket) {
            this.bucket = bucket;
        }

        public String getAccessKeyId() {
            return accessKeyId;
        }

        public void setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
        }

        public String getAccessKeySecret() {
            return accessKeySecret;
        }

        public void setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
        }
    }

}
