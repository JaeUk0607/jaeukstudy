package javabook.exam.ch9;

public class Member {
	private int no;
	private String name;
	private String tel;
	private String email;
	
	Member(int no, String name, String tel, String email) {
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
