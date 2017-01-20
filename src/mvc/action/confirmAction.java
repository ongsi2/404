package mvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mall.DAO.MallDAO;
import mall.DTO.member;

public class confirmAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		request.setCharacterEncoding("UTF-8");
		
		String id=request.getParameter("id");
		
		MallDAO mem=MallDAO.getInstance();
		boolean check=mem.confirm("id");
		
		
		return "mall/hlogin/confirm";
	}

}
