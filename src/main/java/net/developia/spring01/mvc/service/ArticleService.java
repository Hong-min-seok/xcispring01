package net.developia.spring01.mvc.service;

import java.util.List;

import net.developia.spring01.mvc.model.ArticleDTO;


public interface ArticleService {

	void insertArticle(ArticleDTO articleDTO) throws Exception;

	List<ArticleDTO> getArticleList() throws Exception;

	ArticleDTO getDetail(long no, boolean updateReadcount) throws Exception;
	
	ArticleDTO getDetail(long no) throws Exception;

	void updateArticle(ArticleDTO articleDTO) throws Exception;

	void deleteArticle(Long no, String password) throws Exception;
}
