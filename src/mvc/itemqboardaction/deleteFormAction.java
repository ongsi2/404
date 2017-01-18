package mvc.itemqboardaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class deleteFormAction implements SuperAction {
	
    public String executeAction(HttpServletRequest request, HttpServletResponse response){

    	int num = Integer.parseInt(request.getParameter("num"));
        String pageNum = request.getParameter("pageNum");

		request.setAttribute("num", new Integer(num));
        request.setAttribute("pageNum", new Integer(pageNum));

        return "/imageboard/deleteForm.jsp";
    	
    }
}
