import kr.or.bit.Book;
import kr.or.bit.Employee;

public class Ex14_Constructor {

	public static void main(String[] args) {
	 Book book = new Book("ȫ�浿��", 1000);
	 book.BookInfo();
	 
	 System.out.println(book.getbookName());
	 
	 Book book2 = new Book("����ġ��", 500000);
	 book2.BookInfo();
	 System.out.println(book.getbookPrice());
	 
	/* Book q1 = new Book();
	 q1.BookQWQW(name, price);*/
	 
	 Employee e1 = new Employee();
	 e1.employeeInfo();
	 
	 e1.setEmpno(201801);
	 e1.setJob("IT");
	 e1.employeeInfo();
	 System.out.println();
	 
	 //Array �迭�� ����ؼ� 3���� ��� ����� ������(int[] arr = {10,20,30})
	 //������ ����� ������
	 Employee [] emplist = {new Employee(1,"A","IT"),new Employee(2,"B","IT"),new Employee(3,"c","IT")};
	 
	 for(Employee e : emplist) {
		 e.employeeInfo();
		 
	 }
	 for(int i=0; i<emplist.length; i++) {
		 emplist[i].employeeInfo();
	 }
	 
	}

}
