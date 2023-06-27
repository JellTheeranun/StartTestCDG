 package JDBC;

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.PreparedStatement;
 import java.sql.SQLException;

public class DemoJDBC_1 {
	public static void main(String[] args) {
		
	}
	
	public void insertCompany() {
		 
		Connection con = getConnect();
		String sqlInsert = "";
		PreparedStatement pstInsert = null;
		
		try {
			pstInsert = con.prepareStatement(sqlInsert);
			pstInsert.setString(1, "CDGS");
			
			long time = new Date().getTime();
			pstInsert.setDate(2, new java.sql.Date(time));
			
			
			pstInsert.setInt(3, 350);
			
			int result = pstInsert.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstInsert != null) {
					pstInsert.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			try {
				if(con != null) {
					con.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}

	private Connection getConnect() {
		// TODO Auto-generated method stub
		return null;
	}
}


