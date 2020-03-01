package com.grokonez.s3.dto;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public class FileTestDTO {
    private String bucketName;
    private MultipartFile file;

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
