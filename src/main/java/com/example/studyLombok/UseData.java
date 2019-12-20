package com.example.studyLombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PackageName: com.example.studyLombok
 * @ClassName: UseData
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/20  9:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UseData {

    private String username;
    private String email;


    public static void main(String[] args) {
        UseData useData = new UseData();
        UseData useData1 = new UseData("username", "email");

    }

}
