package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.istack.internal.logging.Logger;
import com.sun.org.apache.bcel.internal.Constants;

import pojo.Dictionary;
import pojo.Info;
import pojo.User;
import service.backend.BackendService;


@Controller
@RequestMapping("/manager")
public class Backendlogin {
	@Autowired
	private BackendService bs;
	
	private Logger logger = Logger.getLogger(IndexController.class);

	@RequestMapping("/login")
	public String Login(){
			logger.info("������ƽ̨�����ˣ�");
		return "backendlogin";
	}
	

	@RequestMapping("/dologin")
	public String DoLogin(@RequestParam String userCode,@RequestParam String userPassword,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws ServletException, IOException {
		logger.info("�����̨");
		User user = null;
		try {
			user = bs.DoLogin(userCode, userPassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(null != user){//��¼�ɹ�
			//����session
			session.setAttribute("userSession", user);
			//ҳ����ת��main.jsp��
			return "redirect:/manager/backend/main";
		}else{
			//ҳ����ת��login.jsp��������ʾ��Ϣ--ת��
			request.setAttribute("error", "�û��������벻��ȷ");
			return "backendlogin";
		}
	}
	
	
	
	@RequestMapping(value="/backend/main")
	public String main(HttpSession session){
		if(session.getAttribute("userSession") == null){
			return "redirect:/manager/login";
		}
		return "backend/main";
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session){
		//���session
		session.removeAttribute("userSession");
		return "backendlogin";
	}
	
	
//	@RequestMapping("backend/app/list")
//	public String Show(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
//		List<Info> list = new ArrayList<Info>();
//		List<Dictionary> flatFormList = new ArrayList<Dictionary>();
//		list=bs.BackShowAppList();
//		flatFormList=bs.flatForms();
//		request.setAttribute("flatFormList", flatFormList);
//		request.setAttribute("appInfoList", list);
//		return "backend/applist";
//	}
}
