package service.developer;

import java.util.List;
import pojo.Category;

public interface AppCategoryService {
	
	
	/**
	 * ���ݸ��ڵ�parentId��ȡ��Ӧ�ķ����б�
	 * @param parentId
	 * @return
	 * @throws Exception
	 */
	public List<Category> getAppCategoryListByParentId(Integer parentId)throws Exception;
}
