package com.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//HelloController java Controller 역할을 하기 위해서 implements Controller 통해서
//단점 : Controller 파일 하나가 기능 한가지만 처리....
//아니 기능이 10가지면 함수 10개를 만들어야지 class 10개를 만들면 되니???

//@Controller >> 함수 단위로 mapping 작업이 가능

@Controller
public class HelloController{
	
	@RequestMapping("hello.do")
	public ModelAndView hello() {
		System.out.println("hello.do start");
		ModelAndView mv = new ModelAndView();
		mv.addObject("greating", getGreating());
		mv.setViewName("Hello");
		return mv;
	}
	//필요하다면 일반 함수 만들어서 사용가능
	public String getGreating() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		String data = "";
		if(hour >= 6 && hour <=10) {
			data = "학습시간";
		}else if(hour >=11 && hour <= 15) {
			data = "배고픈시간";
		}else if(hour >=16 && hour <= 18) {
			data ="졸린시간";
		}else {
			data = "go home";
		}
		
		return data;
	}
}
