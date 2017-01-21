package kr.co.suil.common.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.suil.common.login.LoginVO;
import kr.co.suil.common.login.service.LoginService;

@Controller
public class LoginController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	LoginService service;
	
	/** 로그인 페이지 이동 
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/login/loginPage")
	public ModelAndView loginPage(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception{
		logger.info("LoginController :: loginPage :: loaded");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/login/login");
		
		
		return mv;
	}
	
	
	@RequestMapping("/login/loginCheck")
	public void loginCheck(HttpServletRequest request, HttpServletResponse response, HttpSession session, LoginVO params) throws Exception{
		logger.info("LoginController :: loginCheck :: loaded");
		
		//login_check
		
		
		/*session.setAttribute("user_id", params.getUser_id());
		session.setAttribute("user_nm", params.getUser_nm());
		session.setAttribute("user_birth", params.getUser_birth());
		session.setAttribute("user_phone", params.getUser_phone());*/
		
		
	}
	
	@RequestMapping("/login/logout")
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception{
		logger.info("LoginController :: logout :: loaded");
		ModelAndView mv = new ModelAndView();
		
		session.invalidate();
		
		mv.setViewName("/login/login");
		return mv;
		
	}
	
	
	
	
	
	
	
	/**회원가입창 이동 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/login/loginResister")
	public ModelAndView loginResister(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info("LoginController :: loginPage :: loaded");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/login/loginResister");
		return mv;
	}
	
	
	
	
	
	
	
}
