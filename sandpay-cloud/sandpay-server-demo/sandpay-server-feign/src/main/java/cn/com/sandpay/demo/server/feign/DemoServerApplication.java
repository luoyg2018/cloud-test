package cn.com.sandpay.demo.server.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication 
@EnableEurekaClient //开始eureka客户端
@EnableDiscoveryClient //配合@LoadBalanced注释开启负载均衡
@EnableFeignClients //开启Feign
public class DemoServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoServerApplication.class, args);
	}

	/**
	 * 实现服务调用负载均衡
	 * @return
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
