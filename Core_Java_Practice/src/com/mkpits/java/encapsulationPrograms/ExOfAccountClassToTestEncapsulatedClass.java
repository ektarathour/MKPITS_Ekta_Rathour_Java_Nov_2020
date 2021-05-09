package com.mkpits.java.encapsulationPrograms;

public class ExOfAccountClassToTestEncapsulatedClass {
    public static void main(String[] args) {
        //creating instance of Account class
        ExOfAccountDatawithSetAndGetMethod acc=new ExOfAccountDatawithSetAndGetMethod();
        //setting values through setter methods
        acc.setAcc_no(7560504000L);
        acc.setName("Sonoo Jaiswal");
        acc.setEmail("sonoojaiswal@javatpoint.com");
        acc.setAmount(500000f);
        //getting values through getter methods
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
}

