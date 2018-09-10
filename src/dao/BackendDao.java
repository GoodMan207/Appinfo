package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import pojo.Dictionary;
import pojo.Info;
import pojo.User;


public interface BackendDao {	
	public User DoLogin(@Param("userCode") String userCode);
	
	public List<Info> BackShowAppList();
	
	public List<Dictionary> flatForms();

}
