//the simple example of instance initializer block that performs initialization.
package com.mkpits.java.polymorphismmethodoverloadingmethodoverriding;

public class ExOfInstanceInitializerBlock {
    int speed;

    ExOfInstanceInitializerBlock(){System.out.println("speed is "+speed);}

    {speed=100;}

    public static void main(String args[]){
        ExOfInstanceInitializerBlock b1=new ExOfInstanceInitializerBlock();
        ExOfInstanceInitializerBlock b2=new ExOfInstanceInitializerBlock();
    }

}
