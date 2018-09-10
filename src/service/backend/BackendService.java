package service.backend;

import java.util.List;
import java.util.Map;

import pojo.Dictionary;
import pojo.Info;
import pojo.User;

public interface BackendService {
	public User DoLogin(String name,String pwd);
	
	
	public List<Info> BackShowAppList();
	
	public List<Dictionary> flatForms();
}
