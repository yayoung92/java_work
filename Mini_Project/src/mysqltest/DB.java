package mysqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void insert(String todo, String state) {
			
		try {	
			conn = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			System.out.println("success");
			String sql = "INSERT INTO todo (`할일`,`상태`) "
					+ "VALUES (?,?)";
			pstmt = conn.prepareStatement(sql);
			
			System.out.println(">>      DB에 할일입력넣기      <<");
			System.out.println();
			pstmt.setString(1, todo);
			pstmt.setString(2, state);
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void select() {
		
		try {	
			conn = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			System.out.println("success");		
			String sql = "select * from todo";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String todo = rs.getString("할일");
				int idx = rs.getInt("idx");
				String eks = rs.getString("상태");
				
				System.out.println(">>      DB에 할일목록 보여주기      <<");
				System.out.println();
				System.out.println(idx + ". " + todo + " : 상태 = " + eks);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void delete(int idx) {

		try {	
			conn = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			System.out.println("success");		
			String sql = "delete from todo where idx=? ";
			pstmt = conn.prepareStatement(sql);
			
			System.out.println(">>      DB에 할일목록 삭제하기      <<");
			System.out.println();
			pstmt.setInt(1, idx);
			pstmt.executeUpdate();
			

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void update(int idx, String todo) {
		
		try {	
			conn = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			System.out.println("success");
			
			String sql = "update todo set 할일=? where idx=?";
			pstmt = conn.prepareStatement(sql);
			
			System.out.println(">>      DB에 할일수정하기      <<");
			System.out.println();
			pstmt.setString(1, todo);
			pstmt.setInt(2, idx);
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new DB();
	}
}
