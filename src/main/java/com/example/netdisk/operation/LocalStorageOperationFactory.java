package com.example.netdisk.operation;

import javax.annotation.Resource;

import com.example.netdisk.operation.delete.Deleter;
import com.example.netdisk.operation.delete.product.LocalStorageDeleter;
import com.example.netdisk.operation.download.Downloader;
import com.example.netdisk.operation.download.product.LocalStorageDownloader;
import com.example.netdisk.operation.upload.Uploader;
import com.example.netdisk.operation.upload.product.LocalStorageUploader;

import org.springframework.stereotype.Component;

@Component
public class LocalStorageOperationFactory implements FileOperationFactory{

    @Resource
    LocalStorageUploader localStorageUploader;
    @Resource
    LocalStorageDownloader localStorageDownloader;
    @Resource
    LocalStorageDeleter localStorageDeleter;
    @Override
    public Uploader getUploader() {
        return localStorageUploader;
    }

    @Override
    public Downloader getDownloader() {
        return localStorageDownloader;
    }

    @Override
    public Deleter getDeleter() {
        return localStorageDeleter;
    }


}
