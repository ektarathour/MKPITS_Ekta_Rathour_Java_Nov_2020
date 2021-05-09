//Java program to print the hostname and IP address of Local system
package com.mkpits.java.multipalprograms;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ExOfIpAddOfLocalSystem {
    public static void main(String[] args) throws UnknownHostException {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("IP address: " + address.getHostAddress());
            System.out.println("Host name : " + address.getHostName());
        }
        catch (UnknownHostException uhEx) {
            System.out.println( "Could not find local address!");
        }
    }
}

