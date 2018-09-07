package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.istack.internal.logging.Logger;

import pojo.DevUser;
import service.DevService;

@Controller
@RequestMapping("/dev")
public class IndexController {
	private Logger logger = Logger.getLogger(IndexController.class);
	
	@Autowired
	public DevService ds;
	
	@RequestMapping("/login")
	public String Login(){
			logger.info("开发者平进来了！");
		return "devlogin";
	}
	
	
	@RequestMapping("/dologin")
	public String DevLogin(@RequestParam String devCode,@RequestParam String devPassword,HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		logger.info("登入开发平台");
		DevUser dr = new DevUser();
		try {
			dr = ds.DevLogin(devCode, devPassword);	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(dr!=null) {
			//放入session
			session.setAttribute("devUserSession", dr);
			//页面跳转（main.jsp）
			return "redirect:/dev/backend/developer/main";
		}else{
			//页面跳转（login.jsp）带出提示信息--转发
			request.setAttribute("error", "用户名或密码不正确");
			return "devlogin";
		}
	}
	
	@RequestMapping(value="/backend/developer/main")
	public String main(HttpSession session){
		if(session.getAttribute("devUserSession") == null){
			return "redirect:/dev/login";
		}
		return "backend/developer/main";
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session){
		//清除session
		session.removeAttribute("devUserSessionn");
		return "devlogin";
	}

}
