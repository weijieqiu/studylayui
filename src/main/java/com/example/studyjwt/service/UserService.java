package com.example.studyjwt.service;

import com.example.studyjwt.pojo.User;

/**
 * @PackageName: com.example.studyjwt.service
 * @ClassName: UserService
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/1  14:36
 */
public interface UserService {
    User getUser(String id);
    User getUserByName(String name);

}
