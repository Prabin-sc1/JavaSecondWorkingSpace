import java.sql.*;
public class Main {
	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			System.out.println("Connection established");
		} catch (ClassNotFoundException e) {
		
		System.out.println("Exception: "+e.getMessage());
		}
		catch(SQLException e) {
			System.out.println("Exception:"+e.getMessage());
		}
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("Exception "+e.getMessage());
		}
		
	}

}
