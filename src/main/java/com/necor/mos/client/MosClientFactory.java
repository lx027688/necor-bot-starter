package com.necor.mos.client;


import com.necor.mos.client.constant.Client;
import com.necor.mos.config.MosProperties;

import java.util.HashMap;
import java.util.Map;

public class MosClientFactory {

    private static final Map<String, Class<? extends MosClient>> clientMap = new HashMap<>();

    static {
        clientMap.put(Client.LOCAL, LocalSorageClient.class);
        clientMap.put(Client.OSS, AliyunOssClient.class);
        clientMap.put(Client.S3, AwsS3Client.class);
    }

    public static MosClient getClient(String client, MosProperties.ClientProperties clientProperties) {
        Class<? extends MosClient> clientClass = clientMap.get(client.toLowerCase());
        if (clientClass == null) {
            throw new IllegalArgumentException("Invalid client: " + client);
        }
        try {
            MosClient instance = clientClass.getDeclaredConstructor(MosProperties.ClientProperties.class).newInstance(clientProperties);
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Failed to create BotMsgPusher instance", e);
        }
    }

}
