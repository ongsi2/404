package mvc.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.action.MainAction;
import mvc.action.SuperAction;

public class MallServlet extends HttpServlet {
	private MainAction ma = null;
	private Map classMap = new HashMap();
	public void init(ServletConfig config) throws ServletException{
		String path = config.getInitParameter("path");
		FileInputStream is = null;
		try{
			is = new FileInputStream(path);
			Properties p = new Properties();
			p.load(is);
			Iterator key = p.keySet().iterator();
			while(key.hasNext()){
				String k = (String)key.next();
				String v = p.getProperty(k);
				Class className = Class.forName(v);
				Object obj = className.newInstance();
				classMap.put(k, obj);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		if(uri.indexOf(request.getContextPath()) == 0 ){
			uri = uri.substring(request.getContextPath().length());
		}
		Object obj = classMap.get(uri);
		String view = "";
		SuperAction action = null;
		if(obj instanceof SuperAction){
			action = (SuperAction)obj;
			try {
				view = action.executeAction(request, response);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}
}