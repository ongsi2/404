package mvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mall.DAO.MallDAO;

public class cancelProAction implements SuperAction {


		public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Throwable {
			
					
					 String id=request.getParameter("id");
					 String pw=request.getParameter("pw");
					 
					 MallDAO dao=MallDAO.getInstance();
					 
					 try{
						 boolean check=dao.deletemem(id, pw);
						 
					 }catch(Exception e){
						 e.printStackTrace();
					 }
				
					
					return "mall/hlogin/cancelPro.jsp";
				}

			}
