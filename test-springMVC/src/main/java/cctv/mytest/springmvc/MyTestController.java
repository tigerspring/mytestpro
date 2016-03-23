package cctv.mytest.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class MyTestController {

	@RequestMapping("controller")
	public void test(){
		System.out.println("success");
	}
}
