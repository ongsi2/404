package mvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainAction implements SuperAction {
	public String executeAction(HttpServletRequest request, HttpServletResponse response){
	return "mall/main.jsp";
	}
}
