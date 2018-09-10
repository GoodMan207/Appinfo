package service.developer;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AppCategoryMapper;
import pojo.Category;
@Service
public class AppCategoryServiceImpl implements AppCategoryService {

	@Autowired
	private AppCategoryMapper mapper;
	
	@Override
	public List<Category> getAppCategoryListByParentId(Integer parentId)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppCategoryListByParentId(parentId);
	}

}
