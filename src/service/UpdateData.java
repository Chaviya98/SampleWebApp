package service;
import core.DBHelperMySql;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import core.Book;
@WebServlet("/updateData")
public class UpdateData extends HttpServlet  {
    private static final long serialVersionUID = 1L;
    public String bookID;
    public String bookTitle;
    public String bookPrice;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateData() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        bookID =  request.getParameter("bookID");
        bookTitle = request.getParameter("bookTitle");
        bookPrice = request.getParameter("bookPrice");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello Your Updated Book Deatils - Book ID " + bookID + "\n" + " Book Title "+bookTitle+
                "\n" + " Book Price "+bookPrice+"</h1>");
        DBHelperMySql obj = new DBHelperMySql();
        obj.update(bookID,bookTitle,bookPrice);
        writer.close();
    }
}
