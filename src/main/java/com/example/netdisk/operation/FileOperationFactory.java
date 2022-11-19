package com.example.netdisk.operation;

import com.example.netdisk.operation.delete.Deleter;
import com.example.netdisk.operation.download.Downloader;
import com.example.netdisk.operation.upload.Uploader;

public interface FileOperationFactory {
    Uploader getUploader();
    Downloader getDownloader();
    Deleter getDeleter();
}