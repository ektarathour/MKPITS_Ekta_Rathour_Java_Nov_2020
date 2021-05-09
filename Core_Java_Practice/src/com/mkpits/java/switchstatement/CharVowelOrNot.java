//Wap to check character is vowel or not
package com.mkpits.java.switchstatement;

import java.util.Scanner;

public class CharVowelOrNot {


        public static void main(String[] args)
{
            char ch ;
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter an alphabates");
ch=scan.next().charAt(0);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    System.out.println("character is vowel");
                    break;
                default:
                    System.out.printf("chracter is not vowel");
                    break;
            }
        }
    }

