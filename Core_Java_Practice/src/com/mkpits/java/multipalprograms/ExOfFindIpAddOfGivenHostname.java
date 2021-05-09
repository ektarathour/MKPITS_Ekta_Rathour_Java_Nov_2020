//Java program to get the IP address, Hostname based on given Hostname
package com.mkpits.java.multipalprograms;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ExOfFindIpAddOfGivenHostname {
    public static void main(String[] args) {
        String host;
        Scanner input = new Scanner(System.in);
        System.out.print("\n Enter host name: ");
        host = input.nextLine();
        try {
            InetAddress address = InetAddress.getByName(host);
            System.out.println("IP address: " + address.getHostAddress());
            System.out.println("Host name : " + address.getHostName());
            System.out.println("Host name and IP address: " + address.toString());

        } catch (UnknownHostException ex) {
            System.out.println("Could not find " + host);
        }
    }
}
