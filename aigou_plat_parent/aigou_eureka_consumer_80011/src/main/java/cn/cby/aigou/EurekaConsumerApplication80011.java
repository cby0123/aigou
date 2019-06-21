package cn.cby.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaConsumerApplication80011 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication80011.class);
    }
}
