package kr.or.bit;
/*
 책은 책이름을 가지고 있고 가격을 가지고 있다
 책이 출판 되면 반드시 책의 이름과 책의 가격을 가지고 있어야한다
 책의 이름과 가격 정보는 특정 기능을 통해서만 볼수 있고 출판된 이후에는 수정할 수 없다
 책이름과 가격정보는 각각 확인 수 있다.
 */
public class Book {
	private String bookName;
	private int bookPrice;
	
	public String getbookName() {
		return bookName;
		
	}
	public int getbookPrice() {
		return bookPrice;
		
	}
	
	public Book(String bookName, int bookPrice){
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		
		
	}
	/*public void BookQWQW(String name, int price) {
		bookName = name;
		bookPrice = price;
	}*/
	
	
	public void BookInfo() {
		System.out.println("책이름 : "+bookName + "책가격 : "+bookPrice);
		
	}
	
	

}
