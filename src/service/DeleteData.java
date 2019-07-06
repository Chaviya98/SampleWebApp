
package service;
import core.DBHelperMySql;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/deleteData")
public class DeleteData extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public String bookID;



    public DeleteData() {
        super();
        // TODO Auto-generated constructor stub
    }



    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        bookID =  request.getParameter("bookID");

        PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello Your Book Deleted - Book ID " + bookID + "\n" + "</h1>");
        DBHelperMySql obj = new DBHelperMySql();
        obj.delete(bookID);
        writer.close();
    }
}

