package com.roncoo.eshop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @Author linjingcheng
 * @data 2020/10/15
 */
@SpringBootApplication
@EnableTurbine
public class HystrixTurbineServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixTurbineServer.class).web(true).run(args);
    }

}
