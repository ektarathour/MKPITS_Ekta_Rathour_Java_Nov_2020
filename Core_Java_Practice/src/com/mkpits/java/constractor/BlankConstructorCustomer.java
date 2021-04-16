//WAP to class having field customer  id ,name,address using  blank constructor
package com.mkpits.java.constractor;
class Customer {
    int cid;
    String cname;
    String caddress;


    //creating a blank constructor
    public void customer() {
        cid = 101;
        cname = "ekta";
        caddress = "nagpur";

    }

    public void show() {
        System.out.println("cid=" + cid);
        System.out.println("cname=" + cname);
        System.out.println("address=" + caddress);
    }
}

class BlankConstructorCustomer {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.show();
    }
}




