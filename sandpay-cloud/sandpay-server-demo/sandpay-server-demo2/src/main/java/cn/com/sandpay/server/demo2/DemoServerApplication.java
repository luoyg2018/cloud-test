package cn.com.sandpay.server.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication 
@EnableEurekaClient //开始eureka客户端
public class DemoServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoServerApplication.class, args);
	}
}
