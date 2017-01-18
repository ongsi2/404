package img.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import imageboard.dao;
import imageboard.dto;

public class updateProAction implements SuperAction{
	
    public String executeAction( HttpServletRequest request, HttpServletResponse response){
    	String pageNum = request.getParameter("pageNum");
    	String path = request.getRealPath("save");
		int max = 1024*1024*10;
		String enc="euc-kr";
		DefaultFileRenamePolicy df =new DefaultFileRenamePolicy();
        try {
			request.setCharacterEncoding("euc-kr");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
        try{
        MultipartRequest multi = new MultipartRequest(request, path, max, enc, df);
        File save = multi.getFile("save");
        	dto article = new dto();
        	article.setNum(Integer.parseInt(multi.getParameter("num")));
        	article.setWriter(multi.getParameter("writer"));
        	article.setEmail(multi.getParameter("email"));
        	article.setSubject(multi.getParameter("subject"));
        	article.setContent(multi.getParameter("content"));
        	article.setPasswd(multi.getParameter("passwd"));
        	
    		article.setCt(multi.getContentType("save"));
    		article.setOrg(multi.getOriginalFileName("save"));
    		article.setSys(multi.getFilesystemName("save"));
     
    		dao dbPro = dao.getInstance();
			int check;
			check = dbPro.updateArticle(article);
	        request.setAttribute("check", new Integer(check));
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        request.setAttribute("pageNum", new Integer(pageNum));
        return "/imageboard/updatePro.jsp";
    }

}
