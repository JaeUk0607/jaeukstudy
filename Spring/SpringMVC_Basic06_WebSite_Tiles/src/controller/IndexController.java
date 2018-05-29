package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index.htm")
	public String index() {
		//return "index.jsp"; 기존 방법(resolver없이)
		return "home.index";
	}
	
	@RequestMapping("/mousehover.htm")
	public String mousehover() {
		return "mousehover.mousehover";
	}
	@RequestMapping("/dragndrop.htm")
	public String dragndrop() {
		return "dragndrop.dragndrop";
	}
	@RequestMapping("/fileupload.htm")
	public String fileupload() {
		return "fileupload.fileupload";
	}
	@RequestMapping("/giffile.htm")
	public String giffile() {
		return "giffile.GIFfile";
	}
}
