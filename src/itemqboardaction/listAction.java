package img.action;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import imageboard.dao;

public class listAction implements SuperAction {
	public String executeAction(HttpServletRequest request, HttpServletResponse response){
    
    String pageNum = request.getParameter("pageNum");//페이지 번호

    if (pageNum == null) {
        pageNum = "1";
    }
    int pageSize = 10;//한 페이지의 글의 개수
    int currentPage = Integer.parseInt(pageNum);
    int startRow = (currentPage - 1) * pageSize + 1;//한 페이지의 시작글 번호
    int endRow = currentPage * pageSize;//한 페이지의 마지막 글번호
    int count = 0;
    int number=0;

    List articleList = null;
    List articleList2 = null;
    dao dbPro = dao.getInstance();
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
    if (count > 0) {
        try {
			articleList2 = dbPro.getArticles2(startRow, endRow);
		} catch (Exception e) {
			e.printStackTrace();
		}
    } else {
        articleList2 = Collections.EMPTY_LIST;
    }

	number=count-(currentPage-1)*pageSize;
    request.setAttribute("currentPage", new Integer(currentPage));
    request.setAttribute("startRow", new Integer(startRow));
    request.setAttribute("endRow", new Integer(endRow));
    request.setAttribute("count", new Integer(count));
    request.setAttribute("pageSize", new Integer(pageSize));
	request.setAttribute("number", new Integer(number));
	request.setAttribute("articleList", articleList);
	request.setAttribute("articleList2", articleList2);
    return "imageboard/list.jsp";
	}
}
