package service;

import java.util.Map;

import pojo.User;

public interface BackendService {
	public User DoLogin(String name,String pwd);
}
