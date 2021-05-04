package net.developia.spring01.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import net.developia.spring01.mvc.model.ArticleDTO;
import net.developia.spring01.mvc.service.ArticleService;
import net.developia.spring01.mvc.service.ArticleServiceImpl;

public class ArticleUpdateAction extends AbstractController{
	private ArticleService articleService = ArticleServiceImpl.getInstance();

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		long no = Long.parseLong(request.getParameter("no"));
		String title = request.getParameter("title");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String content = request.getParameter("content");

		ArticleDTO articleDTO = new ArticleDTO();
		articleDTO.setNo(no);
		articleDTO.setTitle(title);
		articleDTO.setName(name);
		articleDTO.setPassword(password);
		articleDTO.setContent(content);
		
		ModelAndView mav = new ModelAndView();
		
		try {
			articleService.updateArticle(articleDTO);
			mav.setViewName("result");
			mav.addObject("msg", "게시물이 수정되었습니다.");
			mav.addObject("url", "detail?no=" + articleDTO.getNo());
		}catch (Exception e) {
			e.printStackTrace();
			mav.setViewName("result");
			mav.addObject("msg", e.getMessage());
			mav.addObject("url", "javascript:history.back()");
		}
		
		return mav;
	}

}
