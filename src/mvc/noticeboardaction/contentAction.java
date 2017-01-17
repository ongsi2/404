package mvc.noticeboardaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.action.SuperAction;
import mall.DAO.noticeboardDAO;
import mall.DTO.MallDTO;

public class contentAction implements SuperAction {
	public String executeAction(HttpServletRequest request, HttpServletResponse response){

		int num = Integer.parseInt(request.getParameter("num"));
        String pageNum = request.getParameter("pageNum");

        noticeboardDAO dbPro = noticeboardDAO.getInstance();
        MallDTO article;
		try {
			article = dbPro.getArticle(num);
			 request.setAttribute("article", article);
		} catch (Exception e) {
			e.printStackTrace();
		}
		  
        request.setAttribute("num", new Integer(num));
        request.setAttribute("pageNum", new Integer(pageNum));
        return "/mall/noticeboard/content.jsp";
	}
}
