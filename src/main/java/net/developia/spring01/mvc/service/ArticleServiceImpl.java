package net.developia.spring01.mvc.service;


import java.util.List;

import net.developia.spring01.mvc.model.ArticleDAO;
import net.developia.spring01.mvc.model.ArticleDAOImpl;
import net.developia.spring01.mvc.model.ArticleDTO;



public class ArticleServiceImpl implements ArticleService {

	/** �̱������� ����� ****************************************************************/
	private ArticleServiceImpl() {
	}

	private static final ArticleServiceImpl articleService = new ArticleServiceImpl();

	public static ArticleServiceImpl getInstance() {
		return articleService;
	}

	/*************************************************************************************/

	private ArticleDAO articleDAO = ArticleDAOImpl.getInstance();

	@Override
	public void insertArticle(ArticleDTO articleDTO) throws Exception {

		articleDAO.insertArticle(articleDTO);

	}

	@Override
	public List<ArticleDTO> getArticleList() throws Exception {
		return articleDAO.getArticleList();
	}
	
	@Override
	public ArticleDTO getDetail(long no) throws Exception {
		return getDetail(no, true);
	}

	@Override
	public ArticleDTO getDetail(long no, boolean updateReadcount) throws Exception {
		try {
			
			if(updateReadcount)	articleDAO.updateReadcount(no);
			
			ArticleDTO articleDTO = articleDAO.getDetail(no);
			
			if(articleDTO == null) {
				throw new RuntimeException("�󼼺��� ����");
			}
			return articleDTO;
			
		} finally {}
	}

	@Override
	public void updateArticle(ArticleDTO articleDTO) throws Exception {
		
		if(articleDAO.updateArticle(articleDTO) == 0) {
			throw new RuntimeException("���� ���ų� ��й�ȣ�� Ʋ���ϴ�.");
		}
		
	}

	@Override
	public void deleteArticle(Long no, String password) throws Exception {
		if(articleDAO.deleteArticle(no, password) == 0) {
			throw new RuntimeException("���� ���ų� ��й�ȣ�� Ʋ���ϴ�.");
		}
	}

	

}
