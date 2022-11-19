package com.example.netdisk.exception;

public class NotSameFileExpection extends Exception {
    public NotSameFileExpection() {
        super("File MD5 Different"); // 文件 md5 校验失败异常
    }
}
