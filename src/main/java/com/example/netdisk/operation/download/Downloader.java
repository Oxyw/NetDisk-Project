package com.example.netdisk.operation.download;

import javax.servlet.http.HttpServletResponse;

import com.example.netdisk.operation.download.domain.DownloadFile;

public abstract class Downloader {
    public abstract void download(HttpServletResponse httpServletResponse, DownloadFile uploadFile);
}
