package service.developer;

import java.util.List;

import pojo.Dictionary;

public interface DataDictionaryService {
	
	/**
	 * 根据typeCode查询相应的数据字典列表
	 * @param typeCode
	 * @return
	 * @throws Exception
	 */
	public List<Dictionary> getDataDictionaryList(String typeCode)throws Exception;
}
