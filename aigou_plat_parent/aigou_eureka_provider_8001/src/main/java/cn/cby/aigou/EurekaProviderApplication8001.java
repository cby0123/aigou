package cn.cby.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication8001.class);
    }
}
