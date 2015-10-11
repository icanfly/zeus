package com.zhubajie.devops.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by flybird on 2015/10/11.
 */
@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping
	public String testIndex(){
		return "/test";
	}

}
