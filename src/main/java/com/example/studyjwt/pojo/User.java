package com.example.studyjwt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PackageName: com.example.studyjwt.pojo
 * @ClassName: User
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/1  14:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String username;
    private String password;
}
