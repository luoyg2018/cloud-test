package cn.com.sandpay.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开始eureka服务端
public class SandpayEurekaServerApplication {
	public static void main(String[] args) {
        SpringApplication.run(SandpayEurekaServerApplication.class, args );
    }
}
