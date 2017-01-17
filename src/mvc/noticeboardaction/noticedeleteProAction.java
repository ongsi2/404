package mvc.noticeboardaction;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mall.DAO.noticeboardDAO;
import mvc.action.SuperAction;

public class noticedeleteProAction implements SuperAction{

    public String executeAction( HttpServletRequest request, HttpServletResponse response) {

        try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

        int num = Integer.parseInt(request.getParameter("num"));
        String pageNum = request.getParameter("pageNum");
        String passwd = request.getParameter("passwd");
	    
        noticeboardDAO dbPro = noticeboardDAO.getInstance();
        int check;
		try {
			check = dbPro.deleteArticle(num, passwd);
	        request.setAttribute("check", new Integer(check));
		} catch (Exception e) {
			e.printStackTrace();
		}
        request.setAttribute("pageNum", new Integer(pageNum));
    	    	
    	return "/mall/noticeboard/noticedeletePro.jsp";
    }
}
