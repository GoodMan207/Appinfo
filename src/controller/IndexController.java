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
			logger.info("������ƽ�����ˣ�");
		return "devlogin";
	}
	
	
	@RequestMapping("/dologin")
	public String DevLogin(@RequestParam String devCode,@RequestParam String devPassword,HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		logger.info("���뿪��ƽ̨");
		DevUser dr = new DevUser();
		try {
			dr = ds.DevLogin(devCode, devPassword);	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(dr!=null) {
			//����session
			session.setAttribute("devUserSession", dr);
			//ҳ����ת��main.jsp��
			return "redirect:/dev/backend/developer/main";
		}else{
			//ҳ����ת��login.jsp��������ʾ��Ϣ--ת��
			request.setAttribute("error", "�û��������벻��ȷ");
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
		//���session
		session.removeAttribute("devUserSessionn");
		return "devlogin";
	}

}
