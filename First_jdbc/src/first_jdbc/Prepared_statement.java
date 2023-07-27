/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first_jdbc;

import java.sql.*;

/**
 *
 * @author KRUPAL
 */
public class Prepared_statement {
    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");    //LOAD MYSQL JDBC DRIVER
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Krupal@2001");
            
            String query="insert into e_table values(?,?)";
            PreparedStatement ps =conn.prepareStatement(query);
            ps.setInt(1,18);   //enroll-no
            ps.setString(2,"darshan");  //name

            int i=ps.executeUpdate();
            System.out.println("row updated="+i);
            
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from e_table");
            
            while(rs.next()){
            System.out.println(rs.getInt("e_id"));
            System.out.println(rs.getString("e_name"));
            }
            
            conn.close();
            ps.close();
            st.close();
            rs.close();
       }
//catch(Exception e)
//        {
//            System.out.println("e");
//        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(Exception se)
        {
            se.printStackTrace();
        }
    }

 }
    

