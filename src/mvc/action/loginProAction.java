package mvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mall.DAO.MallDAO;

public class loginProAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response)  {
		
		   String id =request.getParameter("id");
	       String pw= request.getParameter("pw");
	       MallDAO dao=MallDAO.getInstance();
	
		try{
			boolean result=dao.loginCheck(id,pw);
			if(result){
				HttpSession session=request.getSession();
				session.setAttribute("loginId", id);
			}
			request.setAttribute("result", result);
		}catch  (Exception e) {
			e.printStackTrace();
		}

		return "mall/hlogin/loginPro.jsp";
	}

	
}
