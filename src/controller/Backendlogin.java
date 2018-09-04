package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.istack.internal.logging.Logger;

@Controller
public class Backendlogin {
	private Logger logger = Logger.getLogger(IndexController.class);
	@Autowired
	@RequestMapping("/manager/login")
	public String Login(){
			logger.info("管理者平台进来了！");
		return "backendlogin";
	}
}
