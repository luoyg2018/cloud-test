package cn.com.sandpay.server.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "sandpay") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
