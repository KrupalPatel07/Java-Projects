/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package first_jdbc;

import java.sql.*;

public class First_jdbc {
    public Connection conn;
    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");    //LOAD MYSQL JDBC DRIVER
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Krupal@2001");
            
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from e_table");
            
            System.out.print("e_id"+"\t");
            System.out.println("e_name"+"\t\t");
            while(rs.next()){
            System.out.print(rs.getInt("e_id")+"\t");
            System.out.println(rs.getString("e_name")+"\t\t");
            }
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
