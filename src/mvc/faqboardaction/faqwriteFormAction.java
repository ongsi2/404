package mvc.faqboardaction;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.action.SuperAction;

public class faqwriteFormAction implements SuperAction {
    public String executeAction(HttpServletRequest request, HttpServletResponse response){
        int num=0,ref=1,re_step=0,re_level=0;  
        try{  
          if(request.getParameter("num")!=null){
	         num=Integer.parseInt(request.getParameter("num"));
	         ref=Integer.parseInt(request.getParameter("ref"));
	         re_step=Integer.parseInt(request.getParameter("re_step"));
	         re_level=Integer.parseInt(request.getParameter("re_level"));
	      }
		}catch(Exception e){e.printStackTrace();}
		request.setAttribute("num", new Integer(num));
        request.setAttribute("ref", new Integer(ref));
        request.setAttribute("re_step", new Integer(re_step));
        request.setAttribute("re_level", new Integer(re_level));

        return "/mall/faqboard/faqwriteForm.jsp";
    }
}
