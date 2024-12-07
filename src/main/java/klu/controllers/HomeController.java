package klu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@ResponseBody
	@RequestMapping(path="/home", method = RequestMethod.GET)
	public ModelAndView indexPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Employee");
		return mv;
	}
}
