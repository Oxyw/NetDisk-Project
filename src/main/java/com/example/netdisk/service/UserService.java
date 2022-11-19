package com.example.netdisk.service;

import com.example.netdisk.common.RestResult;
import com.example.netdisk.model.User;

public interface UserService {
    RestResult<String> registerUser(User user);
    RestResult<User> login(User user);
    User getUserByToken(String token);
}
