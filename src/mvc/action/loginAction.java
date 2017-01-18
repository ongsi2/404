package mvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginAction implements SuperAction{

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		// TODO Auto-generated method stub
		return "mall/hlogin/login.jsp";
	}

}
