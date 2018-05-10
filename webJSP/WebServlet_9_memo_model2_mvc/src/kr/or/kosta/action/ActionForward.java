package kr.or.kosta.action;

public class ActionForward {
	private boolean isRedirect = false;
	private String Path = null;
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	public String getPath() {
		return Path;
	}
	public void setPath(String path) {
		Path = path;
	}
	
}
