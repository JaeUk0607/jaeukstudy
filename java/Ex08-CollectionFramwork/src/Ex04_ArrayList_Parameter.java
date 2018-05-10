import java.util.ArrayList;

class Empdata{
	private ArrayList elist;//배열의 주소
	private int[] numbers; //배열의 주소
	
	Empdata(){
		this.elist = new ArrayList();
		this.numbers = new int[10];
	}
	
	//getter
	public ArrayList getElist() {
		
		return this.elist;
	}
	//setter
	public void setElist(ArrayList elist) {
		this.elist = elist;
	}
	//getter
	public int[] getNumbers(){
		return this.numbers;
	}
	//setter
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
}
public class Ex04_ArrayList_Parameter {

	public static void main(String[] args) {
		Empdata empdata = new Empdata();
		System.out.println(empdata);
		System.out.println(empdata.getElist().toString());
		
		ArrayList li = new ArrayList();
		li.add(100);
		li.add(200);
		li.add(300);
				
		empdata.setElist(li);
		System.out.println(empdata.getElist().toString());
		
	}

}
