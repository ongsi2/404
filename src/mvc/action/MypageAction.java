package mvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MypageAction implements SuperAction{
	public String executeAction(HttpServletRequest request,HttpServletResponse response){
		String path = request.getRealPath("save");
		System.out.println(path);
		   return "/404/Mypage.jsp";
	}

}
