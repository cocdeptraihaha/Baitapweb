package ltw.ntt.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionMySQL {

		private static String USERNAME = "root";
		private static String PASSWORD = "1234";
		private static String DRIVER = "com.mysql.cj.jdbc.Driver";
		private static String URL = "jdbc:mysql://localhost:3306/ltw_ntt_01";

		public static Connection getConnection() throws SQLException, Exception {
			try {
				Class.forName(DRIVER);
				return DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		public static void main(String[] args) {
			try {
				new DBConnectionMySQL();
				System.out.println(DBConnectionMySQL.getConnection());
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
}
