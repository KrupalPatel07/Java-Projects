
import bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KRUPAL
 */
public class UserDao {
  private final String url1 = "jdbc:mysql://localhost:3306/shopping_db";
  private final String user1 = "krupal";
  private final String password = "krupal@2001";

  public void addUser(User user) throws SQLException, ClassNotFoundException {
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = DriverManager.getConnection(url1, user1,password);
      PreparedStatement stmt = conn.prepareStatement("INSERT INTO users (username, password, email) VALUES (?, ?, ?)");
      stmt.setString(1, user.getName());
      stmt.setString(2, user.getPassword());
      stmt.setString(3, user.getEmail());
      stmt.executeUpdate();
    }
    catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}
