package kr.or.bit;
/*
 å�� å�̸��� ������ �ְ� ������ ������ �ִ�
 å�� ���� �Ǹ� �ݵ�� å�� �̸��� å�� ������ ������ �־���Ѵ�
 å�� �̸��� ���� ������ Ư�� ����� ���ؼ��� ���� �ְ� ���ǵ� ���Ŀ��� ������ �� ����
 å�̸��� ���������� ���� Ȯ�� �� �ִ�.
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
		System.out.println("å�̸� : "+bookName + "å���� : "+bookPrice);
		
	}
	
	

}
