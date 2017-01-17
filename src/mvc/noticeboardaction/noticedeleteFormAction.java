package mvc.noticeboardaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.action.SuperAction;

public class noticedeleteFormAction  implements SuperAction {

	public String executeAction(HttpServletRequest request, HttpServletResponse response){

    	int num = Integer.parseInt(request.getParameter("num"));
        String pageNum = request.getParameter("pageNum");

		request.setAttribute("num", new Integer(num));
        request.setAttribute("pageNum", new Integer(pageNum));

        return "/mall/noticeboard/noticedeleteForm.jsp";
    	
    }
}
