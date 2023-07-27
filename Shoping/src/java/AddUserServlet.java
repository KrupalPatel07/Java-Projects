/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import bean.User;
import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KRUPAL
 */
@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try {
          // get the form data from the request
          String username = request.getParameter("username");
          String password = request.getParameter("password");
          String email = request.getParameter("email");
          
          // create a new User object with the form data
          User user = new User();
          user.setName(username);
          user.setPassword(password);
          user.setEmail(email);
          
          // insert the new user into the database
          UserDao userDao = new UserDao();
          userDao.addUser(user);
          
          // redirect to the home page
          response.sendRedirect(request.getContextPath() + "/");
      } catch (Exception ex) {
          Logger.getLogger(AddUserServlet.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
}