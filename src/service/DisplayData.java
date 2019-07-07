package service;

import core.DBHelperMongoDB;
import core.DBHelperMySql;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/displayData")
public class DisplayData extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public String bookID;
    public String bookTitle;
    public String bookPrice;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayData() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        DBHelperMySql obj = new DBHelperMySql();
        obj.display();
        DBHelperMongoDB obj2 = new DBHelperMongoDB();
        obj2.display();


    }
}
