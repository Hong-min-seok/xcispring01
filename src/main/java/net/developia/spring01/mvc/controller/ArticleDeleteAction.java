package net.developia.spring01.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import net.developia.spring01.mvc.service.ArticleService;
import net.developia.spring01.mvc.service.ArticleServiceImpl;

public class ArticleDeleteAction extends AbstractController{

	ArticleService articleService = ArticleServiceImpl.getInstance();
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		Long no = Long.parseLong(request.getParameter("no"));
		String password = DigestUtils.sha512Hex(request.getParameter("password"));
		ModelAndView mav = new ModelAndView();
		
		try {
			articleService.deleteArticle(no, password);
			mav.setViewName("result");
			mav.addObject("msg", "게시물이 삭제되었습니다.");
			mav.addObject("url", "list");
		}catch (Exception e) {
			e.printStackTrace();
			mav.setViewName("result");
			mav.addObject("msg", e.getMessage());
			mav.addObject("url", "javascript:history.back()");
		}
		
		return mav;
	}

}
