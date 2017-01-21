package kr.co.suil.common.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter {
	Logger log = Logger.getLogger(this.getClass());
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		log.info("=============== LoginCheckInterceptor :: preHandle ");
		HttpSession session = request.getSession(false);
		
		if(session == null){
			log.info("=============== LoginCheck :: session is null");
			response.sendRedirect(request.getContextPath()+"/login/login.jsp");
		}
		LoginVO loginVO = (LoginVO)session.getAttribute("loginVO");
		
		if(loginVO == null){
			log.info("=============== LoginCheck :: loginVO is null");
			response.sendRedirect(request.getContextPath() + "/login/login.jsp");
			return false;
		}
		
		return  true;
	}
}
