package mvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mall.DAO.MallDAO;
import mall.DTO.member;

public class confirmAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		
		
		String id=request.getParameter("id");
		
		MallDAO mem=MallDAO.getInstance();
		boolean result=mem.confirm("id");
		
		request.setAttribute("id", id);
		request.setAttribute("result", result);
		
		
		return "mall/hlogin/confirm.jsp";
	}

}
