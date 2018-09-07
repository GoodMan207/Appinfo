package dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import pojo.User;


public interface BackendDao {	
	public User DoLogin(@Param("userCode") String userCode);

}
