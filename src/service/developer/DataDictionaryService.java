package service.developer;

import java.util.List;

import pojo.Dictionary;

public interface DataDictionaryService {
	
	/**
	 * ����typeCode��ѯ��Ӧ�������ֵ��б�
	 * @param typeCode
	 * @return
	 * @throws Exception
	 */
	public List<Dictionary> getDataDictionaryList(String typeCode)throws Exception;
}
