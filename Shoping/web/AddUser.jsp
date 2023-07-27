<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Add User</title>
 
</head>
<body>
    <h1 class="heading">Add User</h1>
  <form action="AddUserServlet" method="post">
    <label>Username:</label>
    <input type="text" name="username"><br>
    <label>Password:</label>
    <input type="password" name="password"><br>
    <label>Email:</label>
    <input type="email" name="email"><br>
    <button type="submit">Add User</button>
  </form>
</body>
</html>
