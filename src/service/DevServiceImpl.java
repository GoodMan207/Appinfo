package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DevDao;
import pojo.DevUser;

@Service
public class DevServiceImpl implements DevService {
	
	@Autowired
	public DevDao dd;

	@Override
	public DevUser DevLogin(String devCode, String pwd) {
		DevUser dr = new DevUser();
		dr = dd.DevLogin(devCode);
		System.out.println(dr.getDevCode());
		if(dr!=null) {
			if(!dr.getDevPassword().equals(pwd)) {
				dr=null;
			}
		}
		return dr;
	}
	


}
