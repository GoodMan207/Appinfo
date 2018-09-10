package service.backend;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Info;;

public interface AppService {
	
	public List<Info> getAppInfoList(@Param(value="softwareName")String querySoftwareName,
										@Param(value="categoryLevel1")Integer queryCategoryLevel1,
										@Param(value="categoryLevel2")Integer queryCategoryLevel2,
										@Param(value="categoryLevel3")Integer queryCategoryLevel3,
										@Param(value="flatformId")Integer queryFlatformId,
										@Param(value="from")Integer currentPageNo,
										@Param(value="pageSize")Integer pageSize)throws Exception;

	
	public int getAppInfoCount(@Param(value="softwareName")String querySoftwareName,
							   @Param(value="categoryLevel1")Integer queryCategoryLevel1,
							   @Param(value="categoryLevel2")Integer queryCategoryLevel2,
							   @Param(value="categoryLevel3")Integer queryCategoryLevel3,
							   @Param(value="flatformId")Integer queryFlatformId)throws Exception;
	

	public Info getAppInfo(@Param(value="id")Integer id)throws Exception;
	

	public boolean updateSatus(@Param(value="status")Integer status,@Param(value="id")Integer id)throws Exception;
	
}
