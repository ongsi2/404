package mvc.itemqboardaction;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import mall.DAO.itemqboardDAO;
import mall.DTO.MallDTO;
import mvc.action.SuperAction;

public class itemqupdateProAction implements SuperAction{
	
    public String executeAction( HttpServletRequest request, HttpServletResponse response){
    	String pageNum = request.getParameter("pageNum");
    	String path = request.getRealPath("save");
		int max = 1024*1024*10;
		String enc="UTF-8";
		DefaultFileRenamePolicy df =new DefaultFileRenamePolicy();
        try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
        try{
        MultipartRequest multi = new MultipartRequest(request, path, max, enc, df);
        File save = multi.getFile("save");
        MallDTO article = new MallDTO();
        	article.setNum(Integer.parseInt(multi.getParameter("num")));
        	article.setWriter(multi.getParameter("writer"));
        	article.setEmail(multi.getParameter("email"));
        	article.setSubject(multi.getParameter("subject"));
        	article.setContent(multi.getParameter("content"));
        	article.setPasswd(multi.getParameter("passwd"));
       		article.setCt(multi.getContentType("save"));
    		article.setOrg(multi.getOriginalFileName("save"));
    		article.setSys(multi.getFilesystemName("save"));
     
    		itemqboardDAO dbPro = itemqboardDAO.getInstance();
			int check;
			check = dbPro.updateArticle(article);
	        request.setAttribute("check", new Integer(check));
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        request.setAttribute("pageNum", new Integer(pageNum));
        return "/mall/itemqboard/itemqupdatePro.jsp";
    }

}
