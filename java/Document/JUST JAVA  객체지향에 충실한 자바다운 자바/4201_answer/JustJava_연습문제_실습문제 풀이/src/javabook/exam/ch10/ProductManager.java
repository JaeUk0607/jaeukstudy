package javabook.exam.ch10;

public class ProductManager {
	public void search(int no) throws ProductNotFoundException {
		//상품이 검색되지 않은 조건으로 간주함.
		if(no == 0) {
			throw new ProductNotFoundException();
		}
		else
			System.out.println("상품이 검색 되었습니다.");
	}
}
