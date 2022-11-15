package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserCntroller {
	
	
@GetMapping("/user")
public ModelAndView getUser() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("name","Ashok");
		mav.addObject("email","info@ashokit.in");
		mav.addObject("phone","+91 827963152");
		mav.setViewName("index");
		
		return mav;
}	

}
