package project;

import java.sql.*;

public class insert {
	public static void main(String[] args) {
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Raaj@1122003");
			if(conn.isClosed()) {
				System.out.println("Connection is closed.");
				
			}
			else {
				System.out.println("Connection created.. ");
			}
			//create a query 
			String q = "insert into table1(tID, tname, tCity) values(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(q);
			pstmt.setInt(1,2);
			pstmt.setString(2,"baby");
			pstmt.setString(3,"bhojpur");
			
			
			pstmt.executeUpdate(); //since q doesnot give anything that's why we have use executeUpdate
			//if our query return something like int then we do executeQuery
			System.out.println("record is created");
			conn.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}