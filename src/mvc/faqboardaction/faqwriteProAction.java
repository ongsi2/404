package mvc.faqboardaction;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mall.DAO.faqboardDAO;
import mall.DTO.MallDTO;
import mvc.action.SuperAction;

public class faqwriteProAction  implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("UTF-8");
        MallDTO article = new MallDTO();
		article.setNum(Integer.parseInt(request.getParameter("num")));
        article.setWriter(request.getParameter("writer"));
        article.setEmail(request.getParameter("email"));
        article.setSubject(request.getParameter("subject"));
        article.setPasswd(request.getParameter("passwd"));
        article.setReg_date(new Timestamp(System.currentTimeMillis()));
		article.setRef(Integer.parseInt(request.getParameter("ref")));
		article.setRe_step(Integer.parseInt(request.getParameter("re_step")));
		article.setRe_level(Integer.parseInt(request.getParameter("re_level")));
		article.setContent(request.getParameter("content"));
		article.setIp(request.getRemoteAddr());
		
        faqboardDAO dbPro = faqboardDAO.getInstance();
        dbPro.insertArticle(article);
        return "/mall/faqboard/writeformPro.jsp";
	}
}
