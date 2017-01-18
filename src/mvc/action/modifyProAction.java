package mvc.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mall.DAO.MallDAO;
import mall.DTO.member;

public class modifyProAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
		
		member mem=new member();
		
		HttpSession session= request.getSession();
		String id=(String)session.getAttribute("loginId");
		
		mem.setPw(request.getParameter("pw"));
		mem.setMail(request.getParameter("mail"));
		mem.setMailaddress(request.getParameter("mailaddress"));
		mem.setZipcode(request.getParameter("zipcode"));
		mem.setAddress(request.getParameter("address"));
		mem.setAddress2(request.getParameter("address2"));
		mem.setMobile(request.getParameter("mobile"));
		mem.setPhone(request.getParameter("phone"));
		mem.setPhone2(request.getParameter("phone2"));
		mem.setPhone3(request.getParameter("phone3"));
		mem.setId(id);
		
		MallDAO dao=MallDAO.getInstance();
		dao.updateMember(mem);
		
		return "mall/hlogin/modifyPro.jsp";
	}

}
