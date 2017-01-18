package kr.co.suil.sample.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kr.co.suil.common.dao.AbstractDAO;

@Repository("sampleDao")
public class SampleDao extends AbstractDAO{

	
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> getSampleList(Map<String, Object> commandMap) {
		// TODO Auto-generated method stub
		return (List<Map<String, Object>>)selectList("sample.getSampleList", commandMap);
	}

}
