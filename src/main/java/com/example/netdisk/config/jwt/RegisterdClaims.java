package com.example.netdisk.config.jwt;

import lombok.Data;

@Data
public class RegisterdClaims {
    private String iss;
    private String exp;
    private String sub;
    private String aud;
}
