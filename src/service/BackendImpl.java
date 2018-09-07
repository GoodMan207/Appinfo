package service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BackendDao;
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

}
