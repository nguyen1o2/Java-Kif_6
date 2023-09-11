package btl_qlptgt.util;

import java.sql.*;

public class CSDL {
    
    public static Connection getConnection() {
        final String url = "jdbc:sqlserver://localhost:1433;databaseName=QLPTGiaoThong;encrypt=true;trustServerCertificate=true;user=sa;password=1234";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Connect database success!");
            return DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Connect database failure!");
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        return null;
    }
    

}
