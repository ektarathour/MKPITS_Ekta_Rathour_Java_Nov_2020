//A program of java socket programming where client send a text and server receive and
//print it.
package com.mkpits.java.networking;


import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ExOfMyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();//connection established
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println("message=" + str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
