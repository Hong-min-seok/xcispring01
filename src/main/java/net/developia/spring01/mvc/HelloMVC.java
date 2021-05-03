package net.developia.spring01.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloMVC extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		//return new ModelAndView("/WEB-INF/views/hello.jsp", "msg", "Hello Spring MVC");
		return new ModelAndView("hello");
	}

}
