package service.backend;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DataDictionaryMapper;
import pojo.Dictionary;

@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {
	
	@Autowired
	private DataDictionaryMapper mapper;
	
	@Override
	public List<Dictionary> getDataDictionaryList(String typeCode)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDataDictionaryList(typeCode);
	}

}
