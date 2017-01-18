package mall.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import mall.DTO.member;



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
		
		public void insertLogin(member log){
	  	  try{
	  		conn=getConnection();
	        pstmt = conn.prepareStatement("insert into member(name,id,pw,mail,mailaddress,zipcode,address,address2,mobile,phone,phone2,phone3) values(?,?,?,?,?,?,?,?,?,?,?,?)");
	        pstmt.setString(1, log.getName());
	        pstmt.setString(2, log.getId());
	        pstmt.setString(3, log.getPw());
	        pstmt.setString(4, log.getMail());  
	        pstmt.setString(5, log.getMailaddress());
	        pstmt.setString(6,log.getZipcode());
	        pstmt.setString(7, log.getAddress());
	        pstmt.setString(8, log.getAddress2());
	        pstmt.setString(9, log.getMobile());
	        pstmt.setString(10, log.getPhone());
	        pstmt.setString(11, log.getPhone2());
	        pstmt.setString(12, log.getPhone3());
	                 
	        pstmt.executeUpdate();
	  	
		
	  	}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(pstmt !=null){try{pstmt.close();}catch(SQLException s){}}
			if(conn !=null){try{conn.close();}catch(SQLException s){}}
		}
		}
		
		 public boolean loginCheck(String id,String pw){
		    	boolean result =false;
		    	try{
		    		 conn =getConnection();
		    		 pstmt=conn.prepareStatement("select *from member where id=? and pw=?");
		    		 pstmt.setString(1, id);
		    		 pstmt.setString(2, pw);
		    		 rs=pstmt.executeQuery();
		    		 if(rs.next()){
		    			 result=true;
		    		 }
		    	}catch (Exception e){
		    		e.printStackTrace();
		    	}finally{
		    		if(rs !=null){try {rs.close();}catch(SQLException s){}}
		    		if(pstmt !=null){try{pstmt.close();}catch(SQLException s){}}
		    		if(conn !=null){try{conn.close();}catch(SQLException s){}}
		    	}
		    	return result;
		}
	
		 
		 public member getMember(String id)
		 throws Exception{
			 member mem=null;
			 try{
				 conn=getConnection();
				 pstmt=conn.prepareStatement("select * from member where id=?");
				 pstmt.setString(1, id);
				 rs=pstmt.executeQuery();
				 
				 if(rs.next()){
					 mem=new member();
					 mem.seId(rs.getString("id"));
					 mem.setPw(rs.getString("pw"));
					 mem.setMail(rs.getString("mail"));  
					 mem.setMailaddress(rs.getString("mailaddress"));
					 mem.setZipcode(rs.getString("zipcode"));
					 mem.setAddress(rs.getString("address"));
					 mem.setAddress2(rs.getString("address2"));
					 mem.setMobile(rs.getString("mobile"));
					 mem.setPhone(rs.getString("phone"));
					 mem.setPhone2(rs.getString("phone2"));
					 mem.setPhone3(rs.getString("phone3"));
				 }
			 }catch(Exception ex) {
		            ex.printStackTrace();
		        } finally {
		            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
		            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
		            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		        }
				return mem;
		 }
		 
		 public void updateMember(member mem) throws Exception{
			
		 try{
			 conn=getConnection();
			 pstmt=conn.prepareStatement("update member set pw=?,mail=?,mailaddress=?,zipcode=?,address=?,address2=?,"
			 		+ "mobile=?,phone=?,phone2=?,phone3=? where id=?");
			 pstmt.setString(1,mem.getPw());
			 pstmt.setString(2,mem.getMail());
			 pstmt.setString(3,mem.getMailaddress());
			 pstmt.setString(4,mem.getZipcode());
			 pstmt.setString(5,mem.getAddress());
			 pstmt.setString(6,mem.getAddress2());
			 pstmt.setString(7,mem.getMobile());
			 pstmt.setString(8,mem.getPhone());
			 pstmt.setString(9,mem.getPhone2());
			 pstmt.setString(10,mem.getPhone3());
			 pstmt.setString(11, mem.getId());
			 
			 pstmt.executeUpdate();
		     } catch(Exception ex) {
	            ex.printStackTrace();
	        } finally {
	            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
	            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
	        }
   }
}	//end
	
	
	
	
