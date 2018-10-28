package cn.com.sandpay.demo.server.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//指定要调用的服务名称
@FeignClient(value = "server-demo")
public interface DemoFeignServiceHi {
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	String sayHiFromOtherServer(@RequestParam(value = "name") String name);
}
