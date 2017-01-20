package mall.DAO;
import java.sql.*;
import javax.sql.*;

import mall.DTO.MallDTO;

import javax.naming.*;
import java.util.*; 

public class itemDAO {
	private static itemDAO instance = new itemDAO();
	
	public static itemDAO getInstance() {
		return instance;
	
	}
	private itemDAO() { }
	
	private Connection getConnection() throws Exception {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)envCtx.lookup("jdbc/orcl");
		return ds.getConnection();
	}
	public void insertArticle(MallDTO article) throws Exception {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int item_num=article.getItem_num();
		String sql="";
		try {
			conn = getConnection(); 
			pstmt = conn.prepareStatement("select max(item_num) from item");
			rs = pstmt.executeQuery();
			sql = "insert into item(item_num,item_name,item_price,item_img,item_upload,item_type,item_stock) values(item_seq.NEXTVAL,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getItem_name());
			pstmt.setInt(2, article.getItem_price());
			pstmt.setString(3, article.getItem_img());
			pstmt.setTimestamp(4, article.getItem_upload());
			pstmt.setString(5, article.getItem_type());
			pstmt.setInt(6, article.getItem_stock());
			pstmt.executeUpdate();
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
	}
	
	
	public int getArticleCount() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x=0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from item");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				x= rs.getInt(1); 
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
		return x; 
	}
	
	public List getArticles(int start, int end) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List articleList=null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
					"select item_num,item_name,item_price,item_img,item_upload,item_type,item_stock,r "
					+
					"from (select item_num,item_name,item_price,item_img,item_upload,item_type,item_stock,rownum r " +
					"from (select item_num,item_name,item_price,item_img,item_upload,item_type,item_stock " +
					"from item order by item_num asc) order by  item_num asc) where r >= ? and r <= ? ");
					pstmt.setInt(1, start); 
					pstmt.setInt(2, end); 
					rs = pstmt.executeQuery();
					if (rs.next()) {
						articleList = new ArrayList(end); 
						do{ 
							MallDTO article= new MallDTO();
							article.setItem_num(rs.getInt("item_num"));
							article.setItem_name(rs.getString("item_name"));
							article.setItem_price(rs.getInt("item_price"));
							article.setItem_img(rs.getString("item_img"));
							article.setItem_upload(rs.getTimestamp("item_upload"));
							article.setItem_type(rs.getString("item_type"));
							article.setItem_stock(rs.getInt("item_stock"));
							articleList.add(article); 
						}while(rs.next());
					}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}

		
		return articleList;
	}
	
	public MallDTO getArticle(int item_num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MallDTO article=null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"select * from item where item_num = ?"); 
			pstmt.setInt(1, item_num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				article = new MallDTO();
				article.setItem_num(rs.getInt("item_num"));
				article.setItem_name(rs.getString("item_name"));
				article.setItem_price(rs.getInt("item_price"));
				article.setItem_img(rs.getString("item_img"));
				article.setItem_upload(rs.getTimestamp("item_upload"));
				article.setItem_type(rs.getString("item_type"));
				article.setItem_stock(rs.getInt("item_stock"));
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
			return article;
	}
	
	public void deleteArticle(int item_num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"select * from item where item_num = ?");
			pstmt.setInt(1, item_num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
					pstmt = conn.prepareStatement(
					"delete from item where item_num=?");
					pstmt.setInt(1, item_num);
					pstmt.executeUpdate();
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
	}
	
	
	
	public MallDTO updateGetArticle(int item_num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MallDTO article=null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"select * from item where item_num = ?"); 
			pstmt.setInt(1, item_num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				article = new MallDTO();
				article.setItem_num(rs.getInt("item_num"));
				article.setItem_name(rs.getString("item_name"));
				article.setItem_price(rs.getInt("item_price"));
				article.setItem_img(rs.getString("item_img"));
				article.setItem_upload(rs.getTimestamp("item_upload"));
				article.setItem_type(rs.getString("item_type"));
				article.setItem_stock(rs.getInt("item_stock"));
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
		return article;
	}
	
	public void updateArticle(MallDTO article) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		String sql="";
		int item_num=article.getItem_num();
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"select * from item where item_num = ?"); 
			pstmt.setInt(1, item_num);
			rs = pstmt.executeQuery();
			if(rs.next()){
					sql="update item set item_name=?,subject=?,item_price=?";
					sql+=",item_img=?,item_upload=?,item_type=?,item_stock=? where item_num=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, article.getItem_name());
					pstmt.setInt(2, article.getItem_price());
					pstmt.setString(3, article.getItem_img());
					pstmt.setTimestamp(4, article.getItem_upload());
					pstmt.setString(5, article.getItem_type());
					pstmt.setInt(6, article.getItem_stock());
					pstmt.executeUpdate();
				}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
	}
}
