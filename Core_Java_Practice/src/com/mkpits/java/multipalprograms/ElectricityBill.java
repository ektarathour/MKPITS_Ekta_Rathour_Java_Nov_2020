//WAP to calculate electricity bill

package com.mkpits.java.multipalprograms;
import java.util.Scanner;
class ElectricityBill {
    public static void main(String[] args) {
        int custid;
        int charges = 0;
        String name;
        float unit;
        Scanner s = new Scanner(System.in);
        System.out.println("enter customer id");
        custid = s.nextInt();
        System.out.println("enter customer name");
        name = s.next();
        System.out.println("enter unit");
        unit = s.nextFloat();
        if (unit < 199)
            charges = (int) (unit * 1.20);
        else if (unit >= 200 && unit < 400)
            charges = (int) (unit * 1.50);
        else if (unit >= 400 && unit < 600)
            charges = (int) ((unit * 1.80) + (0.15 * charges));
        else if(unit > 600)

            charges = (int) (unit * 2.00);
            charges = charges + 100;
            System.out.println("\n charges" + charges);
        }
    }


