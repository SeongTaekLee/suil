package kr.co.suil.sample.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import kr.co.suil.sample.dao.SampleDao;

@Service("sampleService")
public class SampleServiceImpl implements SampleService{
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="sampleDao")
	private SampleDao sampleDao;
	
	@Override
	public List<Map<String, Object>> getSampleList(Map<String, Object> commandMap) throws Exception {
		// TODO Auto-generated method stub
		
		return sampleDao.getSampleList(commandMap);
	}
}
