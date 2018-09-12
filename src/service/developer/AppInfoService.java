package service.developer;

import java.util.List;
import pojo.Info;

public interface AppInfoService {
	
	/**
	 * ����app
	 * @param appInfo
	 * @return
	 * @throws Exception
	 */
	public boolean add(Info appInfo) throws Exception;
	/**
	 * �޸�app��Ϣ
	 * @param appInfo
	 * @return
	 * @throws Exception
	 */
	public boolean modify(Info appInfo)throws Exception;
	
	/**
	 * ����appIdɾ��appӦ��
	 * @param delId
	 * @return
	 * @throws Exception
	 */
	public boolean deleteAppInfoById(Integer delId)throws Exception;
	
	/**
	 * ����������ѯ��app�б�
	 * @param querySoftwareName
	 * @param queryStatus
	 * @param queryCategoryLevel1
	 * @param queryCategoryLevel2
	 * @param queryCategoryLevel3
	 * @param queryFlatformId
	 * @param devId
	 * @param currentPageNo
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public List<Info> getAppInfoList(String querySoftwareName,Integer queryStatus,
								Integer queryCategoryLevel1,Integer queryCategoryLevel2,
								Integer queryCategoryLevel3,Integer queryFlatformId,
								Integer devId,Integer currentPageNo,Integer pageSize)throws Exception;
	
	/**
	 * ����������ѯappInfo���¼��
	 * @param querySoftwareName
	 * @param queryStatus
	 * @param queryCategoryLevel1
	 * @param queryCategoryLevel2
	 * @param queryCategoryLevel3
	 * @param queryFlatformId
	 * @param devId
	 * @return
	 * @throws Exception
	 */
	public int getAppInfoCount(String querySoftwareName,Integer queryStatus,
							Integer queryCategoryLevel1,Integer queryCategoryLevel2,
							Integer queryCategoryLevel3,Integer queryFlatformId,Integer devId)throws Exception;
	/**
	 * ����id��apkName����appInfo
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Info getAppInfo(Integer id,String APKName)throws Exception;
	
	/**
	 * ɾ��logoͼƬ
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public boolean deleteAppLogo(Integer id)throws Exception;
	
	/**
	 * ͨ��appIdɾ��appӦ��(app_info��app_version)
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public boolean appsysdeleteAppById(Integer id)throws Exception;
	
	
	/**
	 * update Sale Status By AppId and Operator
	 * @param appId
	 * @return
	 * @throws Exception
	 */
	public boolean appsysUpdateSaleStatusByAppId(Info appInfo) throws Exception;
}
