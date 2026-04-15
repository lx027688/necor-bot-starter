package com.necor.mos.client;

import java.io.InputStream;
import java.util.List;

public abstract class MosClient {

    public abstract void upload(String fileName, InputStream input);

    public abstract void delete(String filePath);

    public abstract InputStream get(String filePath);

    public abstract String getAccessibleUrl(String filePath);

    public abstract List<String> getBuckets();

}
