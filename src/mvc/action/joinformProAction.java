package mvc.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mall.DAO.MallDAO;
import mall.DTO.member;

public class joinformProAction implements SuperAction{

	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
		 try{
			 member dto=new member();
			 
			 dto.setName(request.getParameter("name"));
			 dto.setId(request.getParameter("id"));
			 dto.setPw(request.getParameter("pw"));
			 dto.setMail(request.getParameter("mail"));
			 dto.setMailaddress(request.getParameter("mailaddress"));
			 dto.setZipcode(request.getParameter("zipcode"));
			 dto.setAddress(request.getParameter("address"));
			 dto.setAddress2(request.getParameter("address2"));
			 dto.setMobile(request.getParameter("mobile"));
			 dto.setPhone(request.getParameter("phone"));
			 dto.setPhone2(request.getParameter("phone2"));
			 dto.setPhone3(request.getParameter("phone3"));
			 
			 MallDAO dao=MallDAO.getInstance();
			 dao.insertLogin(dto);
			 
		 }catch (Exception e) {
				
				
				e.printStackTrace();
			}
		
		
		
		return "/mall/hlogin/joinformPro.jsp";
	}

}
