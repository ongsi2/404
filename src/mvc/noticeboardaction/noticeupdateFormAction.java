package mvc.noticeboardaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mall.DAO.noticeboardDAO;
import mall.DTO.MallDTO;
import mvc.action.SuperAction;

public class noticeupdateFormAction implements SuperAction {
	public String executeAction(HttpServletRequest request, HttpServletResponse response){
		 
        int num = Integer.parseInt(request.getParameter("num"));
        String pageNum = request.getParameter("pageNum");

        noticeboardDAO dbPro = noticeboardDAO.getInstance();
        MallDTO article;
		try {
			article = dbPro.updateGetArticle(num);
	        request.setAttribute("article", article);
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        request.setAttribute("pageNum", new Integer(pageNum));

        return "/mall/noticeboard/noticeupdateForm.jsp";
	}
}
