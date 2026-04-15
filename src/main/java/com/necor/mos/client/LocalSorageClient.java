package com.necor.mos.client;

import com.necor.mos.config.MosProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class LocalSorageClient extends MosClient {

    private static final Logger log = LoggerFactory.getLogger(LocalSorageClient.class);
    private MosProperties.ClientProperties properties;

    public MosProperties.ClientProperties getProperties() {
        return properties;
    }

    public void setProperties(MosProperties.ClientProperties properties) {
        this.properties = properties;
    }

    public LocalSorageClient(MosProperties.ClientProperties clientProperties) {

        String bucket = clientProperties.getBucket();
        if (bucket == null){
            throw new IllegalArgumentException("Invalid Local storage configuration");
        }
        this.setProperties(clientProperties);
    }

    @Override
    public void upload(String fileName, InputStream input){
        if (fileName == null || fileName.isEmpty() || input == null ) {
            throw new IllegalArgumentException("Invalid fileName or input is null");
        }
        // 创建目标文件
        String fullPath = getFullPath(fileName);
        File file = new File(fullPath);

        // 确保父目录存在
        File parentDir = file.getParentFile();
        if (parentDir != null && !parentDir.exists()) {
            parentDir.mkdirs();
        }

        // 使用 FileOutputStream 写入文件
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            byte[] buffer = new byte[1024]; // 1KB 缓冲区
            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String filePath) {
        String fullPath = getFullPath(filePath);

        Path path = Paths.get(fullPath);
        try {
            if (Files.exists(path)) {
                Files.delete(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
            log.error("Error deleting file: " + e.getMessage());
        }
    }

    @Override
    public InputStream get(String filePath) {
        String fullPath = getFullPath(filePath);
        try {
            return Files.newInputStream(Paths.get(fullPath));
        } catch (InvalidPathException e) {
            throw new IllegalArgumentException("无效的文件路径格式", e);
        } catch (IOException e) {
            throw new RuntimeException("无法打开文件: " + filePath, e);
        }
    }

    @Override
    public String getAccessibleUrl(String filePath) {
        return properties.getEndpoint()+filePath;
    }

    @Override
    public List<String> getBuckets() {
        return Collections.emptyList();
    }

    private String getFullPath(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("Invalid fileName is null");
        }
        String bucket = properties.getBucket();
        if (bucket == null || bucket.isEmpty()) {
            throw new IllegalArgumentException("Invalid bucket is null");
        }
        return bucket + File.separator + fileName;
    }
}
