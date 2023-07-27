<%-- 
    Document   : Addproduct
    Created on : 12-Apr-2023, 3:14:57 pm
    Author     : KRUPAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Product</h1>
        <form action="AddProductServlet" method="post">
            <label>Id:</label>
            <input type="number" name="id" id="id"><br>
            
            <label>Name:</label>
            <input type="text" name="name" id="name"><br>
            
            <label>Description:</label>
            <textarea name="" id="descrption" cols="20" rows="4" placeholder="type here"></textarea><br>
            
            <label>Price :</label>
            <input type="number" name="price" id="price"><br>
            
            <label>Image :</label>
            <input type="file" name="image" id="image"><br>
            
            <input type="submit" value="submit">
        </form>
    </body>
</html>
