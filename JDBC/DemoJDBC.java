package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DemoJDBC {
	public static void main(String[] args) {
		
	}
	public Connection getConnect() {
		
		Connection con = null;
		
		try {
			Class.forName("");
			con = DriverManager.getConnection("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
 