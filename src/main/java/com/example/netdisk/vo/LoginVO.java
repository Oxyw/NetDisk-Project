package com.example.netdisk.vo;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="登录VO")
@Data
public class LoginVO {
    @Schema(description="用户名")
    private String username;
    @Schema(description="token")
    private String token;
}
