package mysqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
	public void insert() {
		System.out.println("DB에 할일입력넣기");
		
		
		// 예외 처리 
		try {	
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.38:3306/ygy?serverTimezone=UTC", "root", "1234");
			System.out.println("success");		
			Statement stmt = conn.createStatement();
			String sql = "insert into todo(idx, 할일, 상태) values(?,?,?)";
			PreparedStatement s = conn.prepareStatement(sql);
			ResultSet rs = s.executeQuery();
			
			while(rs.next()) {
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void select() {
		try {	
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.38:3306/ygy?serverTimezone=UTC", "root", "1234");
			System.out.println("success");		
			String sql = "select * from todo";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				String todo = rs.getString("할일");
				int idx = rs.getInt("idx");
				String eks = rs.getString("상태");
				
				System.out.println(idx + ". " + todo + " : 상태 = " + eks);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("DB에 할일목록 보여주기");
	}
	
	public static void main(String[] args) {
		new DB();
	}
}
