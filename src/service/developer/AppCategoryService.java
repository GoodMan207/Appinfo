package service.developer;

import java.util.List;
import pojo.Category;

public interface AppCategoryService {
	
	
	/**
	 * 根据父节点parentId获取相应的分类列表
	 * @param parentId
	 * @return
	 * @throws Exception
	 */
	public List<Category> getAppCategoryListByParentId(Integer parentId)throws Exception;
}
