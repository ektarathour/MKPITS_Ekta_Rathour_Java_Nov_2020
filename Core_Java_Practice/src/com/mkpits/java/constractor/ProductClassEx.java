//WAP to Create class prodcut

package com.mkpits.java.constractor;

import java.util.Scanner;
class Product {

  String pid;
  String pname;
  float sp;
  int p_qty;
  String batch_name;
  String mfg_dt;
  String expiry_dt;

  void addproduct() {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter product ID");
    pid = scan.next();
    System.out.println("�nter product name");
    pname = scan.next();
    System.out.println("enter product selling price");
    sp = scan.nextFloat();
    System.out.println("enter product quality");
    p_qty = scan.nextInt();
    System.out.println("enter product batch name");
    p_qty = scan.nextInt();
    System.out.println("mfg_dt=" + mfg_dt);
    pid = scan.next();
    System.out.println("expiry_dt=" + expiry_dt);
    pid = scan.next();
  }


  public void show() {
    System.out.println("pid=" + pid);
    System.out.println("pname=" + pname);
    System.out.println("sp=" + sp);
    System.out.println("mfg_dt=" + mfg_dt);
    System.out.println("expiry_dt=" + expiry_dt);
  }
}

public class ProductClassEx {
  public static void main(String[] args) {
    Product p = new Product();//automatically it will be called
    System.out.println("\n");
    System.out.println("book detail");
    p.show();


  }
}
