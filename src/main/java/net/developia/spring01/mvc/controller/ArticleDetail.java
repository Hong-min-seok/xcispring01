package net.developia.spring01.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import net.developia.spring01.mvc.model.ArticleDTO;
import net.developia.spring01.mvc.service.ArticleService;
import net.developia.spring01.mvc.service.ArticleServiceImpl;

public class ArticleDetail extends AbstractController {
	ArticleService articleService = ArticleServiceImpl.getInstance();

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		long no = Long.parseLong(request.getParameter("no"));
		
		try {
			ArticleDTO articleDTO = articleService.getDetail(no);
			return new ModelAndView("detail", "articleDTO", articleDTO);
		} catch (Exception e) {
			e.printStackTrace();
			ModelAndView mav = new ModelAndView("result.jsp");
			mav.addObject("msg", e.getMessage());
			mav.addObject("url", "list");
			return mav;
		}
	}


}