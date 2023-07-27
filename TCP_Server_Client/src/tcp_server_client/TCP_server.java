/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcp_server_client;

/**
 *
 * @author KRUPAL
 */
import java.io.*;
import java.net.*;
import java.util.*;

public class TCP_server {
    
    public static void main(String []a)
    {
        try{
            ServerSocket ss = new ServerSocket(1234);
            
            Socket s = ss.accept();
            
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a message for client");
            String line = sc.nextLine();
            
            dos.writeUTF(line);
            dos.close();
            ss.close();
            s.close();
            }
        
        catch(Exception e){
            
        }
    }
    
    
}
