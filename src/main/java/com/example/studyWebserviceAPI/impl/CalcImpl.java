package com.example.studyWebserviceAPI.impl;

import com.example.studyWebserviceAPI.Calc;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * @PackageName: com.example.studyWebserviceAPI.impl
 * @ClassName: CalcImpl
 * @Description: 计算接口实现类
 * @author: qiuweijie
 * @date: 2019/12/24  9:26
 */
@Component("calc")
@WebService(name = "calc", targetNamespace = "http://studyWebserviceAPI.example.com/",
        endpointInterface = "com.example.studyWebserviceAPI.Calc")
public class CalcImpl implements Calc {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1-num2;
    }
}
