<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Hello World Java EE</title>
</head>
<body>
<h1>Hello JSP and Servlet!</h1>
<form action="helloServlet" method="post">
    Enter Book ID: <input type="number" name="bookID" size="5">
    Enter Book Title: <input type="text" name="bookTitle" size="20">
    Enter Book Price: <input type="number" name="bookPrice" size="20">
    <input type="submit" value="Call Servlet" />
</form>
</body>
</html>
