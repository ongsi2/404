package img.action;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import imageboard.dao;
import imageboard.dto;

public class writeFormProAction  implements SuperAction{

	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String path = request.getRealPath("save");
		System.out.println(path);
		int max = 1024*1024*10;
		String enc="euc-kr";
		DefaultFileRenamePolicy df =new DefaultFileRenamePolicy();
        try {
			request.setCharacterEncoding("euc-kr");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        try {
        	MultipartRequest multi = new MultipartRequest(request, path, max, enc, df);

        File save = multi.getFile("save");
        dto article = new dto();
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

        dao dbPro = dao.getInstance();
        dbPro.insertArticle(article);
        } catch (IOException e){
         e.printStackTrace();
        }

        return "/imageboard/writeFormPro.jsp";
	}
}
