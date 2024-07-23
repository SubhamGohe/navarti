package Java.Developer.Navarti_Check_jsp_page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class A {
	//localhost:1010/M1
	@RequestMapping("/M1")
	 String m1() {
		 return"AA1";
	 }
	//localhost:1010/M2
		@RequestMapping("/M2")
		 String m2() {
			 return"java";
		 }
		//localhost:1010/M3
				@RequestMapping("/M3")
				 String m3() {
					 return"java_Developer";
				 }
}
