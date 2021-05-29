//A program of java socket programming where client send a text and server receive and
////print it.
package com.mkpits.java.networking;

import java.io.DataOutputStream;
import java.net.Socket;

public class ExOfMyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello server");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

