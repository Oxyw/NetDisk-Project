package com.example.netdisk.model;

import lombok.Data;

import javax.persistence.*;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.IdType;

/**
 * 文件实体类
 */
@Data
@Table(name = "file")
@Entity
@TableName("file")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @Column(columnDefinition="bigint(20) comment '文件id'")
    private Long fileId;

    @Column(columnDefinition="varchar(500) comment '时间戳名称'")
    private String timeStampName;

    @Column(columnDefinition="varchar(500) comment '文件url'")
    private String fileUrl;

    @Column(columnDefinition="bigint(10) comment '文件大小'")
    private Long fileSize;

    @Column(columnDefinition="int(1) comment '存储类型'")
    private Integer storageType;

    @Column(columnDefinition="varchar(32) comment 'md5唯一标识'") // 当检测上传文件的 md5 已存在，则文件已存在于服务器，直接返回上传成功
    private String identifier;

    @Column(columnDefinition="int(1) comment '引用数量'") // 当上传的文件在服务器已存在，则 pointCount 加 1，文件删除的时候减 1，此时如果引用数量大于 0，则文件逻辑删除，等于 0 时文件需要彻底物理删除
    private Integer pointCount;
}
