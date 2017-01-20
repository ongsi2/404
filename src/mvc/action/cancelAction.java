package mvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cancelAction implements SuperAction {


	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		return "mall/hlogin/cancel.jsp";
	}

}
