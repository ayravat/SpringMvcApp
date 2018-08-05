package com.sample.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value="/test")
public class RestControllerModelAndView {

	@RequestMapping(value="/t1")
	public ModelAndView testRest(RequestBean reqBean){
		
		ModelAndView mv = new ModelAndView("test","msg","Hello World");
		return mv;
	}
}
