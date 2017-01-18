package kr.co.suil.sample.service;

import java.util.List;
import java.util.Map;

public interface SampleService {

	List<Map<String, Object>> getSampleList(Map<String, Object> commandMap) throws Exception;

}
