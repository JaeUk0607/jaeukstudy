package com.receipt;

public class Receipt {

	private String name;
	private int price;
	private String time;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void getReceiptInfo() {
		System.out.println("카드사 : " + getName());
		System.out.println("결제금액: " + getPrice());
		System.out.println("결제일시: " + getTime());
	}
}
