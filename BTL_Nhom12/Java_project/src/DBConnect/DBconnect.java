package DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getConnection();
	}
	public static Connection getConnection() {
   	 String DB_URL = "jdbc:sqlserver://localhost:1433;"+ "databaseName=QLSinhVien;"
	            + "integratedSecurity=true";
	     String USER_NAME = "sa";
	    String PASSWORD = "1234";
       Connection conn = null;
       try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
           System.out.println("connect successfully!");
       } catch (Exception ex) {
           System.out.println("connect failure!");
           ex.printStackTrace();
       }
       return conn;
   }
}
