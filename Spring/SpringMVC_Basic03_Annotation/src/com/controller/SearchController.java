package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
	/*
	 WEB : Client 전송 데이터 -> Server 데이터 받기 (회원가입데이터 , 게시판 입력데이터)
	 
	  방법 : 전통(request 객체)
	 void searchInternal (HttpServletRequest request){
	 	String id = request.getPrameter("id")
	 }
	  방법_2 : DTO 객체를 통해서 받는 방법 (게시판 데이터, 회원 가입..)
	       : 선택조건 : ?id=hong&name=김유신&age=100 == dto 객체의 memberfield명과 같아야 한다.
	       : input 태그 : name = "id"
	 void searchInternal (MemberDTO member){
	 	IOC 컨테이너 자동 객체 생성......
	 	자동으로 주입 (값...)
	 	View 페이지까지 전달...(memberDto key 만들어져서 전달)
	 }
	 
	 방법_3 : Spring Annotation > @RequestParam
	 방법_1 , 방법_2 단점이라고 하면 (유효성 체크)
	 
	 @RequestParam (간단한 유효성 처리 , 기본값에 대한 설정)
	 
	 방법_4(편하게 : 객체 단위로 받지 않는 것들)
	 void searchInternal (int page , int number)
	 ** 넘어오는 parameter 이름이 함수의 parameter 명과 같으면 ...END
	 ** internar.do?page=100&number=1000
	 
	 
	 방법_5 @PathVariable  /member/{memberid}
	 게시판 : http://cafe.naver.com/bitcamp104/1358
	 
	 */
	
	//방법_3
	@RequestMapping("search/internal.do")
	public ModelAndView searchInternal(@RequestParam("query") String query , @RequestParam("p") int p) {
		
		System.out.println("param query : " + query);
		System.out.println("param p : " + p);
		return new ModelAndView("search/internal");
	}
	/*
	 Default: <a href="search/external.do?query=hong">external.do</a>
	 <br>
	 Default2:<a href="search/external.do?p=100">external.do</a>
	 <br>
	 Required :<a href="search/external.do">external.do</a>
	 <br>
	 paramter name: <a href="search/external.do?query=kim&p=1000">external.do</a>
	 */
	
	/*@RequestMapping("search/external.do")
	public ModelAndView searchExternal(@RequestParam(value = "query" , required=false) String query , 
									   @RequestParam(value = "p" , defaultValue="1") int p) {
		
		System.out.println("param query : " + query);
		System.out.println("param p : " + p);
		return new ModelAndView("search/internal");
	}*/
	
	//활용한다면 게시판 List 페이지에 (기본값 실행시...)
/*	@RequestMapping("search/external.do")
	public ModelAndView searchExternal(@RequestParam(value = "query" , defaultValue = "default") String query , 
									   @RequestParam(value = "p" , defaultValue="111") int p) {
		
		System.out.println("param query : " + query);
		System.out.println("param p : " + p);
		return new ModelAndView("search/internal");
	}*/
	
	//방법_4(편하게 : 객체 단위로 받지 않는 값들)
	//단 ?query=aaa&p=100 > 함수의 parameter 이름과 동일 ? 유효성 처리 안됨
	@RequestMapping("search/external.do")
	public ModelAndView searchExternal(String query , int p) {
		System.out.println("param query : " + query);
		System.out.println("param p : " + p);
		return new ModelAndView("search/internal");
	}

}
