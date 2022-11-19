package com.example.netdisk.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 文件列表查询接口接收前台请求信息的载体
 */
@Data
@Schema(name = "文件列表DTO",required = true)
public class UserfileListDTO {
    @Schema(description = "文件路径")
    private String filePath;
    @Schema(description = "当前页码")
    private Long currentPage;
    @Schema(description = "一页显示数量")
    private Long pageCount;
}
