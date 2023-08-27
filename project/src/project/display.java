package project;
import java.sql.*;

	public class display {
		public static void main(String[] args) {
			try {
				Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Raaj@1122003");
				String query = "Select * from table1";
				Statement stmt = conn.createStatement();
				ResultSet set = stmt.executeQuery(query);
				
				while(set.next()) {
					int id = set.getInt(1);
					String name = set.getString(2);
					String city = set.getString(3);
					System.out.println(name+" : "+id+" : "+city);
					
				}
				conn.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

