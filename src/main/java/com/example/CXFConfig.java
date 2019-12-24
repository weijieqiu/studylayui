package com.example;

import com.example.studyWebserviceAPI.Calc;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

/**
 * @PackageName: com
 * @ClassName: CXFConfig
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/24  9:31
 */
@Configuration
public class CXFConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private Calc calc;

    @Bean()
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus,calc);
        endpoint.publish("/calc");
        return endpoint;
    }
}
