<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>CHAVEEN</title>
</head>
<body>
<h1>BOOK WORLD</h1>

<h4>ADD BOOK</h4>
<form action="insertData" method="post">
    Enter Book ID: <input type="number" name="bookID" size="5"><br><br>
    Enter Book Title: <input type="text" name="bookTitle" size="20"><br><br>
    Enter Book Price: <input type="number" name="bookPrice" size="20"><br><br>
    <input type="submit" value="Add" />
</form>
<br>
<br>
<p>

</p>
<h4>DELETE BOOK</h4>
<form action="deleteData" method="post">
    Enter Book ID: <input type="number" name="bookID" size="5"><br><br>

    <input type="submit" value="Delete" />
</form>
<br>
<br>
<p>

</p>
<h4>UPDATE BOOK</h4>
<form action="updateData" method="post">
    Enter Book ID: <input type="number" name="bookID" size="5"><br><br>
    Enter Book Title: <input type="text" name="bookTitle" size="20"><br><br>
    Enter Book Price: <input type="number" name="bookPrice" size="20"><br><br>
    <input type="submit" value="Update" />
</form>
<br>
<br>
<p>

</p>
<h4>DISPLAY BOOK</h4>
<form action="displayData" method="post">

    <input type="submit" value="Display" />
</form>
</body>
</html>
