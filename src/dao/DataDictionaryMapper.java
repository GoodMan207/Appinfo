package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Dictionary;

public interface DataDictionaryMapper {
	
	public List<Dictionary> getDataDictionaryList(@Param("typeCode")String typeCode)throws Exception;
}
