package img.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import imageboard.dao;
import imageboard.dto;

public class updateFormAction implements SuperAction {
	 public String executeAction(HttpServletRequest request, HttpServletResponse response){
		 
	        int num = Integer.parseInt(request.getParameter("num"));
	        String pageNum = request.getParameter("pageNum");

	        dao dbPro = dao.getInstance();
	        dto article;
			try {
				article = dbPro.updateGetArticle(num);
		        request.setAttribute("article", article);
			} catch (Exception e) {
				e.printStackTrace();
			}

			dto article2;
			try {
				article2 = dbPro.updateGetArticle2(num);
		        request.setAttribute("article2", article2);
			} catch (Exception e) {
				e.printStackTrace();
			}
	        
	        request.setAttribute("pageNum", new Integer(pageNum));

	        return "/imageboard/updateForm.jsp";
		 
	 }
}
