package mvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderAction implements SuperAction{
	public String executeAction(HttpServletRequest request,HttpServletResponse response){

		return "/404/Order.jsp";
	}
}
