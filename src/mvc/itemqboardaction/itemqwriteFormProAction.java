package mvc.itemqboardaction;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import mall.DAO.itemqboardDAO;
import mall.DTO.MallDTO;
import mvc.action.SuperAction;

public class itemqwriteFormProAction  implements SuperAction{

	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String path = request.getRealPath("save");
		System.out.println(path);
		int max = 1024*1024*10;
		String enc="UTF-8";
		DefaultFileRenamePolicy df =new DefaultFileRenamePolicy();
        try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        try {
        	MultipartRequest multi = new MultipartRequest(request, path, max, enc, df);

        File save = multi.getFile("save");
        MallDTO article = new MallDTO();
		article.setNum(Integer.parseInt(multi.getParameter("num")));
        article.setWriter(multi.getParameter("writer"));
        article.setEmail(multi.getParameter("email"));
        article.setSubject(multi.getParameter("subject"));
        article.setPasswd(multi.getParameter("passwd"));
        article.setReg_date(new Timestamp(System.currentTimeMillis()));
		article.setRef(Integer.parseInt(multi.getParameter("ref")));
		article.setRe_step(Integer.parseInt(multi.getParameter("re_step")));
		article.setRe_level(Integer.parseInt(multi.getParameter("re_level")));
		article.setContent(multi.getParameter("content"));
		article.setIp(request.getRemoteAddr());
		article.setCt(multi.getContentType("save"));
		article.setOrg(multi.getOriginalFileName("save"));
		article.setSys(multi.getFilesystemName("save"));

        itemqboardDAO dbPro = itemqboardDAO.getInstance();
        dbPro.insertArticle(article);
        } catch (IOException e){
         e.printStackTrace();
        }

        return "/mall/itemqboard/itemqwriteFormPro.jsp";
	}
}
