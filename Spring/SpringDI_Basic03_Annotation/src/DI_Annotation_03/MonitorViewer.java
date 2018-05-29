package DI_Annotation_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {
	
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}

	//일치하는 injection이 없으면 null이 나온다
	@Autowired(required = false) //Default > true (무조건 injection)
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("setter 주입 성공");
	}
	
	
	
}







