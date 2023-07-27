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

public class TCP_client {
    public static void main(String []a)
    {
        try{
            Socket s = new Socket("127.0.0.1",1234);
            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String data =dis.readUTF();
            
            System.out.println(data);
            
            dis.close();
            s.close();
        }
        catch(Exception e){
            
        }
    }
}
