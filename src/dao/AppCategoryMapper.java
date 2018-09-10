package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Category;

public interface AppCategoryMapper {
	
	public List<Category> getAppCategoryListByParentId(@Param("parentId")Integer parentId)throws Exception;
}
