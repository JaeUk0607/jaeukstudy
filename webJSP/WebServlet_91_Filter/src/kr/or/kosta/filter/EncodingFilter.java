package kr.or.kosta.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


//@WebFilter("/EncodingFilter")
public class EncodingFilter implements Filter {
	//member filed
	private String encoding;
	
   
    public EncodingFilter() {
        
    }

	
	public void destroy() {
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		//초기화 함수 (한번 실행)
	/*	<init-param>
  		<param-name>encoding</param-name>
  		<param-value>UTF-8</param-value>
  		</init-param>*/
		this.encoding = fConfig.getInitParameter("encoding");
		System.out.println("Filter init : " + this.encoding);
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//request (요청이 왔을때 처리되는 코드)
		if(request.getCharacterEncoding()==null) {
			System.out.println("Before : " + request.getCharacterEncoding());
			request.setCharacterEncoding(this.encoding);
			System.out.println("after : " + request.getCharacterEncoding());
		}
		chain.doFilter(request, response); //다른 필터를 호출...
		//response (응답할때 처리되는 코드)
		System.out.println("response 응답 처리 Bye Bye ^^");
	}



}
