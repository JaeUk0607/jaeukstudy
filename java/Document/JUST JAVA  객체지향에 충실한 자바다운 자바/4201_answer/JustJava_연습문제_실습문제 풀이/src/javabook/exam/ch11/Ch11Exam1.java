package javabook.exam.ch11;

import javabook.exam.ch10.ProductManager;
import javabook.exam.ch10.ProductNotFoundException;

public class Ch11Exam1 {

	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		try {
			pm.search(0); // 0이외의 값이 입력되면 예외 발생
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
			System.out.println("검색 조건을 확인해 주세요!!");
		}
	}

}
