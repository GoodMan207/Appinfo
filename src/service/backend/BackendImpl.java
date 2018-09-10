package service.backend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BackendDao;
import pojo.Dictionary;
import pojo.Info;
import pojo.User;

@Service
public class BackendImpl implements BackendService {

	@Autowired
	private BackendDao bd;
	
	@Override
	public User DoLogin(String name,String pwd) {
			User user = new User();
			user=bd.DoLogin(name);
			if(user!=null) {
				if(!user.getUserPassword().equals(pwd)) {
					user=null;
				}
			}
		return user;
	}

	@Override
	public List<Info> BackShowAppList() {
		List<Info> list =new  ArrayList<Info>();
		list = bd.BackShowAppList();
		return list;
	}

	@Override
	public List<Dictionary> flatForms() {
		List<Dictionary> list = new ArrayList<Dictionary>();
		list=bd.flatForms();
		return list;
	}
	
	

}
