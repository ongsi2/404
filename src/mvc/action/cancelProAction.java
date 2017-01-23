package mvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mall.DAO.MallDAO;

public class cancelProAction implements SuperAction {


		public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Throwable {
			
					
			      HttpSession session= request.getSession();
			         String id=(String)session.getAttribute("loginId");
					 String pw=request.getParameter("pw");
					 
					 MallDAO dao=MallDAO.getInstance();
					 
					 try{
						 boolean check=dao.deletemem(id, pw);
						 request.setAttribute("check", check);
						 
					 }catch(Exception e){
						 e.printStackTrace();
					 }
					 
				
					
					return "mall/hlogin/cancelPro.jsp";
				}

			}
