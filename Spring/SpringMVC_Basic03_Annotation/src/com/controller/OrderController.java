package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.OrderCommand;
import com.model.OrderItem;

//주문화면 , 주문처리
//Forward 방식 : 같은 URL (method = GET , POST)

//1. 요청 주소달리하기 : /order/order.do (화면)
//				   /order/orderok.do (처리)

//2. 같은 요청 주소 : /order/order.do : 화면 , 처리 모두

@Controller
@RequestMapping("/order/order.do")
public class OrderController {
	
	@RequestMapping(method= RequestMethod.GET)	//화면
	public String form() {
		return "order/OrderForm";
	}
	
	@RequestMapping(method= RequestMethod.POST)	//처리
	public String submit(OrderCommand ordercommand) {
		System.out.println("ordercommand 주소: " + ordercommand);
		System.out.println("ordercommand 크기: " + ordercommand.getOrderItem().size());
		
		//검증코드
		List<OrderItem> items = ordercommand.getOrderItem(); //상품 목록 List 주소값 리턴
		for(OrderItem item : items) {
			System.out.println(item.toString());
		}
		
		return "order/OrderCommited";
	}

}
