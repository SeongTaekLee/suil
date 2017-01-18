package kr.co.suil.sample.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.suil.sample.service.SampleService;

@Controller
public class SampleController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="sampleService")
	private SampleService sampleService;
	
	/**샘플 페이지
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/sample/samplePage.do")
	public ModelAndView openSampleList(Map<String, Object> commandMap) throws Exception{
		log.debug(":::::: SampleController :::: samplePage ::: loaded");
		ModelAndView mv = new ModelAndView("/sample/sample");
		
		//리스트 가져오기 
		List<Map<String, Object>> list = sampleService.getSampleList(commandMap);
		log.debug("getSampleList size ::: "+list.size());
		mv.addObject("list", list);
		
		
		return mv;
		
	}
	
	
	/*@RequestMapping(value="/sample/getSampleList")
	public void getSampleList(Map<String, Object> commandMap) throws Exception{
		log.debug(":::: SampleController ::: getSampleList :::: loaded");
		List<Map<String, Object>> list = sampleService.getSampleList(commandMap);
		log.debug("getSampleList size ::: "+list.size());
	}*/
	
}


