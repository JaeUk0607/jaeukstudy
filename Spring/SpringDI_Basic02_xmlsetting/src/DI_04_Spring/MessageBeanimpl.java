package DI_04_Spring;

public class MessageBeanimpl implements MessageBean{

	private String name;
	private String greating;
	
	//name member field 생성자를 통해서 초기화
	public MessageBeanimpl(String name) {
		this.name = name; //member field 초기화
	}
	
	//greeting member field 는 setter 함수를 통해서 초기화
	public void setGreating(String greating) {
		this.greating = greating;
	}


	@Override
	public void sayHello() {
		System.out.println(this.name + " / " + this.greating);
	}

}
