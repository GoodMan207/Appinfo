package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.istack.internal.logging.Logger;

@Controller
public class IndexController {
	private Logger logger = Logger.getLogger(IndexController.class);
	@Autowired
	@RequestMapping("/manager/login")
	public String Login(){
			logger.info("½øÀ´ÁË£¡");
		return "backendlogin";
	}
	
	

}
