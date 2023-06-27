package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DemoJDBC_2 {

	public static void main(String[] args) {
		
	}
	
	public List<String> getCompanyNames(){
		
		Connection con = getConnect();
		String sqlQuery = "Select name from company";
		Statement st = null;
		ResultSet rs = null; 
		
		
		List<String> companyNames = new ArrayList<String>();
		try {
			st = con.createStatement();
			rs = st.executeQuery(sqlQuery);
			while(rs.next()) {
				companyNames.add(rs.getString("name"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(st != null) {
					st.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(con != null) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private Connection getConnect() {
		// TODO Auto-generated method stub
		return null;
	}
}
