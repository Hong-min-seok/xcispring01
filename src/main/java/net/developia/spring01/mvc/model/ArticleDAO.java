package net.developia.spring01.mvc.model;


import java.sql.SQLException;
import java.util.List;

public interface ArticleDAO {

	void insertArticle(ArticleDTO articleDTO) throws SQLException;

	List<ArticleDTO> getArticleList() throws SQLException;

	void updateReadcount(long no) throws SQLException;

	ArticleDTO getDetail(long no) throws SQLException;

	// update가 잘 수행되었는지 받기 위해 int 반환
	int updateArticle(ArticleDTO articleDTO) throws SQLException;

	int deleteArticle(Long no, String password) throws SQLException;

}
