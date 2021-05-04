package net.developia.spring01.mvc.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import net.developia.spring01.mvc.model.ArticleDTO;
import net.developia.spring01.mvc.service.ArticleService;
import net.developia.spring01.mvc.service.ArticleServiceImpl;

public class ArticleList extends AbstractController{

	private ArticleService articleService = ArticleServiceImpl.getInstance();
	
	//private static Logger logger= Logger.getLogger(ArticleList.class);
	
	private static Logger logger = LoggerFactory.getLogger(ArticleList.class);
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		logger.info("log4j test");
		
		ModelAndView mav = new ModelAndView();
		
		try {
			List<ArticleDTO> list = articleService.getArticleList();
			mav.setViewName("list");
			mav.addObject("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mav;
	}

}
