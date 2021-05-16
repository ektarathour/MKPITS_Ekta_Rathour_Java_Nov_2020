//final method is inherited
package com.mkpits.java.finalmethodvariableclasskeywordmethod;

public class ExOfFinalMethodWithInheritance {
    final void run(){System.out.println("running...");}
}
class Honda2 extends ExOfFinalMethodWithInheritance{
    public static void main(String args[]){
        new Honda2().run();
    }
}
