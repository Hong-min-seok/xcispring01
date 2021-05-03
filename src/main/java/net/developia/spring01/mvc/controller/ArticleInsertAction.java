package net.developia.spring01.mvc.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import net.developia.spring01.mvc.model.ArticleDTO;
import net.developia.spring01.mvc.service.ArticleService;
import net.developia.spring01.mvc.service.ArticleServiceImpl;


public class ArticleInsertAction extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		String title = request.getParameter("title");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String content = request.getParameter("content");

		ArticleDTO articleDTO = new ArticleDTO();
		articleDTO.setTitle(title);
		articleDTO.setName(name);
		articleDTO.setPassword(password);
		articleDTO.setContent(content);
		System.out.println(articleDTO);

		ArticleService articleService = ArticleServiceImpl.getInstance();

		ModelAndView mav = new ModelAndView();
		try {
			articleService.insertArticle(articleDTO);
			mav.setViewName("redirect:list");
		} catch (Exception e) {
			e.printStackTrace();
			mav.setViewName("/WEB-INF/views/result.jsp");
			mav.addObject("msg", "오류입니당.");
			mav.addObject("url", "javascript:history.back();");
		}
		return mav;
	}

}
