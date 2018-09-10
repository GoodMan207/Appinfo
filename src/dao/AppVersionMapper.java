package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.AppVersion;

public interface AppVersionMapper {
	
	public List<AppVersion> getVersionList(@Param("appId")Integer appId) throws Exception;
	
	public int add(AppVersion Version)throws Exception;
	
	public int getVersionCountByAppId(@Param("appId")Integer appId)throws Exception;
	
	public int deleteVersionByAppId(@Param("appId")Integer appId)throws Exception;
	
	public AppVersion getVersionById(@Param("id")Integer id)throws Exception;
	
	public int modify(AppVersion Version)throws Exception;
	
	public int deleteApkFile(@Param("id")Integer id)throws Exception;
}
