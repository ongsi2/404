package mvc.faqboardaction;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mall.DAO.faqboardDAO;
import mvc.action.SuperAction;

public class faqboardAction implements SuperAction {
	public String executeAction(HttpServletRequest request, HttpServletResponse response){
	    String pageNum = request.getParameter("pageNum");//������ ��ȣ

	    if (pageNum == null) {
	        pageNum = "1";
	    }
	    int pageSize = 10;//�� �������� ���� ����
	    int currentPage = Integer.parseInt(pageNum);
	    int startRow = (currentPage - 1) * pageSize + 1;//�� �������� ���۱� ��ȣ
	    int endRow = currentPage * pageSize;//�� �������� ������ �۹�ȣ
	    int count = 0;
	    int number=0;

	    List articleList = null;
	    faqboardDAO dbPro = faqboardDAO.getInstance();
	    try {
			count = dbPro.getArticleCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    if (count > 0) {
	        try {
				articleList = dbPro.getArticles(startRow, endRow);
			} catch (Exception e) {
				e.printStackTrace();
			}
	    } else {
	        articleList = Collections.EMPTY_LIST;
	    }

		number=count-(currentPage-1)*pageSize;
	    request.setAttribute("currentPage", new Integer(currentPage));
	    request.setAttribute("startRow", new Integer(startRow));
	    request.setAttribute("endRow", new Integer(endRow));
	    request.setAttribute("count", new Integer(count));
	    request.setAttribute("pageSize", new Integer(pageSize));
		request.setAttribute("number", new Integer(number));
		request.setAttribute("articleList", articleList);
	    return "/mall/faqboard/faqboard.jsp";
	}
}
