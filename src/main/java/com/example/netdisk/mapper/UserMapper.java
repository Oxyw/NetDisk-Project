package com.example.netdisk.mapper;

import com.example.netdisk.model.User;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface UserMapper extends BaseMapper<User>{
    void insertUser(User user); // 新增用户
    List<User> selectUser(); // 查询用户
}
