/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import bean.product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KRUPAL
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try
        {
          // get the form data from the request
          String id = request.getParameter("id");
          String name = request.getParameter("name");
          String description = request.getParameter("description");
          String price = request.getParameter("price");
          String image = request.getParameter("image");
          
          // create a new User object with the form data
          product product = new product();
          product.setId(id);
          product.setName(name);
          product.setDescription(description);
          product.setPrice(price);
          product.setImage(image);
          
          // insert the new user into the database
          ProductDao productDao = new ProductDao();
          productDao.addProduct(product);
          
          // redirect to the home page
          response.sendRedirect(request.getContextPath() + "/");
        }
        catch (Exception ex)
        {
          Logger.getLogger(AddUserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
