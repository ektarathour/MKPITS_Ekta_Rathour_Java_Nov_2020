//Program of final method
package com.mkpits.java.finalmethodvariableclasskeywordmethod;

public class ExOfFinalMethod {
    final void demo(){
        System.out.println("XYZ Class Method");
    }
}

class ABC extends ExOfFinalMethod{
    public static void main(String args[]){
        ABC obj= new ABC();
        obj.demo();
    }
}

