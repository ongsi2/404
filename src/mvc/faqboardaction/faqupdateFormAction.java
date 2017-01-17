package mvc.faqboardaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mall.DAO.faqboardDAO;
import mall.DTO.MallDTO;
import mvc.action.SuperAction;

public class faqupdateFormAction implements SuperAction {
	public String executeAction(HttpServletRequest request, HttpServletResponse response){
		 
        int num = Integer.parseInt(request.getParameter("num"));
        String pageNum = request.getParameter("pageNum");

        faqboardDAO dbPro = faqboardDAO.getInstance();
        MallDTO article;
		try {
			article = dbPro.updateGetArticle(num);
	        request.setAttribute("article", article);
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        request.setAttribute("pageNum", new Integer(pageNum));

        return "/mall/faqboard/faqupdateForm.jsp";
	}
}
