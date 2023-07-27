
import bean.product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KRUPAL
 */
public class ProductDao {
    private final String url1 = "jdbc:mysql://localhost:3306/shopping_db";
  private final String user1 = "krupal";
  private final String password = "krupal@2001";

  public void addUser(product product) throws Exception, ClassNotFoundException {
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = DriverManager.getConnection(url1, user1,password);
      PreparedStatement stmt = conn.prepareStatement("INSERT INTO users (id,name,description,price,image) VALUES (?,?,?,?,?)");
      stmt.setString(1, product.getId());
      stmt.setString(1, product.getName());
      stmt.setString(2, product.getDescription());
      stmt.setString(3, product.getPrice());
      stmt.setString(3, product.getImage());
      stmt.executeUpdate();
    }
    catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

    void addProduct(product product) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
