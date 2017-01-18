package mvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mall.DAO.MallDAO;
import mall.DTO.member;

public class modifyAction implements SuperAction {


	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		HttpSession session= request.getSession();
		String id=(String)session.getAttribute("loginId");
		
		MallDAO mem=MallDAO.getInstance();
		member m=mem.getMember(id);
		
		request.setAttribute("m",m);
		
		
		return "mall/hlogin/modify.jsp";
	}

}
