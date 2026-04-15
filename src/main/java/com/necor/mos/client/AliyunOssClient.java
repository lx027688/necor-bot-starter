package com.necor.mos.client;

import com.aliyun.oss.OSSClient;
import com.necor.mos.config.MosProperties;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public class AliyunOssClient extends MosClient {

    private OSSClient storage;

    private MosProperties.ClientProperties properties;

    public MosProperties.ClientProperties getProperties() {
        return properties;
    }

    public void setProperties(MosProperties.ClientProperties properties) {
        this.properties = properties;
    }

    public OSSClient getStorage() {
        return storage;
    }

    public void setStorage(OSSClient storage) {
        this.storage = storage;
    }

    public AliyunOssClient(MosProperties.ClientProperties clientProperties) {
        String accessKeyId = clientProperties.getAccessKeyId();
        String accessKeySecret = clientProperties.getAccessKeySecret();
        String endpoint = clientProperties.getEndpoint();
        String region = clientProperties.getRegion();
        String bucket = clientProperties.getBucket();
        if (accessKeyId == null || accessKeySecret == null || endpoint == null || region == null || bucket == null){
            throw new IllegalArgumentException("Invalid OSS configuration");
        }
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        ossClient.setRegion(region);
        this.setStorage(ossClient);
        this.setProperties(clientProperties);
    }

    @Override
    public void upload(String fileName, InputStream input){
        if (fileName == null || input == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("Invalid fileName or input is null");
        }
        String bucket = properties.getBucket();
        if(bucket == null || bucket.isEmpty()) {
            throw new IllegalArgumentException("Invalid bucket is null");
        }
        storage.putObject(bucket, fileName, input);
    }

    @Override
    public void delete(String filePath) {
        String bucket = properties.getBucket();
        if(bucket == null || bucket.isEmpty()) {
            throw new IllegalArgumentException("Invalid bucket is null");
        }
        storage.deleteObject(bucket, filePath);
    }

    @Override
    public InputStream get(String filePath) {
        return null;
    }

    @Override
    public String getAccessibleUrl(String filePath) {
        return "";
    }

    @Override
    public List<String> getBuckets() {
        return Collections.emptyList();
    }
}
