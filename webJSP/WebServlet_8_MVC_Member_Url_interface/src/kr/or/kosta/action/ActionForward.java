package kr.or.kosta.action;

//로직 제어 와 화면 전달 제어 클래스
public class ActionForward {
	private boolean isRedirect = false; //redirect 할꺼야 말꺼야
	private String path = null; //너 이동 경로 어디야
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
}
