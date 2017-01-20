package mvc.mypageaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CartAction implements SuperAction{
	public String executeAction(HttpServletRequest request,HttpServletResponse response){

		return "/404/Cart.jsp";
	}
}
