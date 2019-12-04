package org.line.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 仓库服务
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RepertoryApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(RepertoryApplication.class,args);
    }
}
