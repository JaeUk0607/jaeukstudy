package javabook.exam.ch10;

public class ProductNotFoundException extends Exception {
	public ProductNotFoundException() {
		super();
	}
	
	public String toString() {
		return "요청한 상품이 존재하지 않습니다.!!";
	}
}
