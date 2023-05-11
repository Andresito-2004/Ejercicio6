package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UseConnectionPool {
    private static Connection getConnection()
            throws SQLException {
        return ConnectionPool.getConnection();
    }
    public static void main(String[] args)
            throws SQLException {
        try (Connection conn = getConnection();
             Statement stmt =
                     conn.createStatement();
             ResultSet rs =
                     stmt.executeQuery("SELECT * FROM my_app.users_tbl")) {
 while (rs.next()) {

     System.out.print(rs.getString("user_firstname"));
        System.out.print(" | ");
            System.out.println(rs.getString("user_lastname"));
     System.out.print(" | ");
     System.out.println(rs.getString("user_emaill"));
     System.out.print(" | ");
     System.out.println(rs.getString("user_password"));
        }
    }
}
}