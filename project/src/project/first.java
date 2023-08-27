package project;
import java.sql.*;
public class first {
	public static void main(String[] args)throws SQLException{
		Connection cn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Raaj@1122003");
		if(cn!=null) {
			System.out.println("dpe");
		}
	}
}
