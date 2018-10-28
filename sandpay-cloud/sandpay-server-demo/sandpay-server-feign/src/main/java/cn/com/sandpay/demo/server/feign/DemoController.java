package cn.com.sandpay.demo.server.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@Autowired
	DemoFeignServiceHi demoFeignServiceHi;
	
    @RequestMapping("/hi")
    public String hi() {
    	return demoFeignServiceHi.sayHiFromOtherServer("feign-test");
    }

}
