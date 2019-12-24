package com.example.studyWebserviceAPI;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @PackageName: com.example.studyWebserviceAPI
 * @ClassName: Calc
 * @Description: 计算接口
 * @author: qiuweijie
 * @date: 2019/12/24  9:24
 */
@WebService()
public interface Calc {

    @WebMethod
    int add(@WebParam(name="num1") int num1, @WebParam(name = "num2")int num2);
    @WebMethod
    int sub(@WebParam(name="num1") int num1, @WebParam(name = "num2")int num2);


}
