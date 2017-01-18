package img.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import imageboard.dao;

public class deleteProAction implements SuperAction{
	
    public String executeAction( HttpServletRequest request, HttpServletResponse response) {

        try {
			request.setCharacterEncoding("euc-kr");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

        int num = Integer.parseInt(request.getParameter("num"));
        String pageNum = request.getParameter("pageNum");
        String passwd = request.getParameter("passwd");
	    
        dao dbPro = dao.getInstance();
        int check;
		try {
			check = dbPro.deleteArticle(num, passwd);
	        request.setAttribute("check", new Integer(check));
		} catch (Exception e) {
			e.printStackTrace();
		}
        request.setAttribute("pageNum", new Integer(pageNum));
    	    	
    	return "/imageboard/deletePro.jsp";
    }

}
