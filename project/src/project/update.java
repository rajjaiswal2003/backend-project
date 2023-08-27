package project;

import java.sql.*;
import java.io.*;

public class update {
	public static void main(String[] agrs) {
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Raaj@1122003");
			String q = "Update table1 set tname=?, tCity=? where tID=?";
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter new name :") ;
			String name = br.readLine();
			
			System.out.println("Enter new city :") ;
			String city = br.readLine();
			
			System.out.println("Enter roll no :") ;
			int num = Integer.parseInt(br.readLine());
			
			PreparedStatement pstmt = conn.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, num);
			
			pstmt.executeUpdate();
			System.out.println("Your record is updated ");
			conn.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}