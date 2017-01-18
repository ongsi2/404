package mall.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import mall.DTO.MallDTO;




public class MallDAO {

	private static MallDAO instance = new MallDAO();
	
	public static MallDAO getInstance() {
		return instance;
	
	}
	  private Connection conn=null;
      private PreparedStatement pstmt=null;
      private ResultSet rs=null;
	
      
      private MallDAO() {}
	
	private Connection getConnection() throws Exception {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)envCtx.lookup("jdbc/orcl");
		return ds.getConnection();
	}
	
	public void insertLogin(MallDTO log){
  	  try{
  		  conn=getConnection();
  		  pstmt = conn.prepareStatement("insert into member(name,id,pw,mail,mailaddress,zipcode,address,address2,mobile,phone,phone2,phone3,point,grade,reg_date) "
  		  		+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate)");
  		  pstmt.setString(1, log.getName());
  		  pstmt.setString(2, log.getId());
  		  pstmt.setString(3, log.getPw());
  		  pstmt.setString(4, log.getMail());  
  		  pstmt.setString(5, log.getMailaddress());
  		  pstmt.setString(6,log.getZipcode());
  		  pstmt.setString(7, log.getAddress());
  		  pstmt.setString(8, log.getAddress2());
  		  pstmt.setString(9, log.getMobile());
  		  pstmt.setString(10, log.getPhone2());
  		  pstmt.setString(11, log.getPhone3());
  		  pstmt.setString(12, log.getPhone1());
  		  pstmt.setInt(13, log.getPoint());
  		  pstmt.setString(14, log.getGrade());
  	  	  pstmt.setTimestamp(15, log.getReg_date());
  	   pstmt.executeUpdate();
	
  	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(pstmt !=null){try{pstmt.close();}catch(SQLException s){}}
		if(conn !=null){try{conn.close();}catch(SQLException s){}}
	}
	}
	
	
	
}
	
	
	
	
	
	
