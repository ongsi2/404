package mvc.noticeboardaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.action.SuperAction;
import mall.DAO.noticeboardDAO;
import mall.DTO.MallDTO;

public class noticeupdateProAction implements SuperAction {
    public String executeAction( HttpServletRequest request, HttpServletResponse response){
    	String pageNum = request.getParameter("pageNum");
    	try{
        	MallDTO article = new MallDTO();
        	article.setNum(Integer.parseInt(request.getParameter("num")));
        	article.setWriter(request.getParameter("writer"));
        	article.setEmail(request.getParameter("email"));
        	article.setSubject(request.getParameter("subject"));
        	article.setContent(request.getParameter("content"));
        	article.setPasswd(request.getParameter("passwd"));

        	noticeboardDAO dbPro = noticeboardDAO.getInstance();
			int check;
			check = dbPro.updateArticle(article);
	        request.setAttribute("check", new Integer(check));
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        request.setAttribute("pageNum", new Integer(pageNum));
        return "/mall/noticeboard/noticeupdatePro.jsp";
    }
}
