package dao;

import org.apache.ibatis.annotations.Param;

import pojo.DevUser;

public interface DevDao {
	public DevUser DevLogin(@Param("devCode") String devCode);
	 
}
