package com.necor.mos.client;

import com.necor.mos.config.MosProperties;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.core.ResponseInputStream;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.http.ContentStreamProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.*;
import software.amazon.awssdk.services.s3.paginators.ListBucketsIterable;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AwsS3Client extends MosClient {

    private S3Client client;

    private MosProperties.ClientProperties properties;

    public MosProperties.ClientProperties getProperties() {
        return properties;
    }

    public void setProperties(MosProperties.ClientProperties properties) {
        this.properties = properties;
    }

    public S3Client getClient() {
        return client;
    }

    public void setClient(S3Client client) {
        this.client = client;
    }

    public AwsS3Client(MosProperties.ClientProperties clientProperties) {
        String accessKeyId = clientProperties.getAccessKeyId();
        String accessKeySecret = clientProperties.getAccessKeySecret();
        String endpoint = clientProperties.getEndpoint();
        String region = clientProperties.getRegion();
        String bucket = clientProperties.getBucket();
        if (accessKeyId == null || accessKeySecret == null || endpoint == null || region == null || bucket == null){
            throw new IllegalArgumentException("Invalid OSS configuration");
        }

        S3Client s3 = S3Client.builder().credentialsProvider(new AwsCredentialsProvider() {
            @Override
            public AwsCredentials resolveCredentials() {
                return AwsBasicCredentials.create(accessKeyId, accessKeySecret);
            }
        }).region(Region.of(region)).build();

        this.setClient(s3);
        this.setProperties(clientProperties);
    }

    @Override
    public void upload(String filePath, InputStream input){
        if (filePath == null || input == null || filePath.isEmpty()) {
            throw new IllegalArgumentException("Invalid filePath or input is null");
        }
        String bucket = properties.getBucket();
        if(bucket == null || bucket.isEmpty()) {
            throw new IllegalArgumentException("Invalid bucket is null");
        }
        PutObjectRequest putObjectRequest = PutObjectRequest.builder().bucket(bucket).key(filePath).build();

        RequestBody body = RequestBody.fromContentProvider(ContentStreamProvider.fromInputStream(input), "text/plain");

        PutObjectResponse response = client.putObject(putObjectRequest, body);
    }

    @Override
    public void delete(String filePath) {
        String bucket = properties.getBucket();
        if(bucket == null || bucket.isEmpty()) {
            throw new IllegalArgumentException("Invalid bucket is null");
        }
        DeleteObjectRequest request = DeleteObjectRequest.builder().bucket(bucket).key(filePath).build();
        DeleteObjectResponse response = client.deleteObject(request);
    }

    @Override
    public InputStream get(String filePath) {
        if (filePath == null || filePath.isEmpty()) {
            throw new IllegalArgumentException("File path cannot be null or empty");
        }

        String bucket = properties.getBucket();
        if (bucket == null || bucket.isEmpty()) {
            throw new IllegalArgumentException("Bucket cannot be null or empty");
        }

        GetObjectRequest getOb = GetObjectRequest.builder().bucket(bucket).key(filePath).build();

        try {
            ResponseInputStream<GetObjectResponse> objectStream = client.getObject(getOb);
            if (objectStream == null) {
                throw new RuntimeException("Failed to retrieve object from storage");
            }
            return objectStream;
        } catch (S3Exception e) {
            // 可根据项目需求封装为自定义异常或记录日志
            throw new RuntimeException("Error reading file from storage: " + filePath, e);
        }
    }

    @Override
    public String getAccessibleUrl(String filePath) {
        return "";
    }

    @Override
    public List<String> getBuckets() {
        ListBucketsIterable response = client.listBucketsPaginator();
        if (response == null || response.buckets() == null) {
            return new ArrayList<>();
        }
        return response.buckets().stream().map(Bucket::name).collect(Collectors.toList());
    }
}
