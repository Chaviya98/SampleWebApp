package core;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DBHelperMySql {
    public void connect(String bookID,String bookTitle,String bookPrice){
        Connection connection = null;
        Statement stmt = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/bookitems", "root", "");

            stmt = connection.createStatement();
            stmt.execute("INSERT INTO ITEMS (ID,TITLE,PRICE) "
                    + "VALUES ("+bookID+",'"+bookTitle+"',"+bookPrice+")");
        }
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


}
