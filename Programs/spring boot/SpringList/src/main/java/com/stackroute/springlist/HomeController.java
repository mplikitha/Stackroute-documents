package com.stackroute.springlist;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping("home")
	public ModelAndView home(ArrayList<String> list, ModelAndView model) {
		//ModelAndView model=new ModelAndView("home");
		//List<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("banana");
		model.addObject("msg",list);
		return model;
	}
	
}