package project;

import java.sql.*;

public class create {
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
			String q = "create table table1(tID int,primary key(tID), tname varchar(20) not null, tCity varchar(400))";
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(q); 
			//if our query return something like int then we do executeQuery
			System.out.println("table 1 is created");
			conn.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


