package core;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DBHelperMySql {
    public Statement connect(){
        Connection connection = null;
        Statement stmt = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/bookitems", "root", "");

            stmt = connection.createStatement();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return stmt;

    }

    public void add(String bookID,String bookTitle,String bookPrice){
        Statement stmt = connect();
        try
        {

            stmt.execute("INSERT INTO ITEMS (ID,TITLE,PRICE) "
                    + "VALUES ("+bookID+",'"+bookTitle+"',"+bookPrice+")");
        }
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void delete(String bookID){
        Statement stmt = connect();
        try
        {

            stmt.execute("DELETE FROM ITEMS WHERE ID IN ('"+bookID+"')");
        }
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void update(String bookID,String bookTitle,String bookPrice){
        Statement stmt = connect();
        try
        {

            stmt.execute("UPDATE ITEMS SET TITLE =('"+bookTitle+"'),PRICE = ('"+bookPrice+"')WHERE ID = ('"+bookID+"')");
        }
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
