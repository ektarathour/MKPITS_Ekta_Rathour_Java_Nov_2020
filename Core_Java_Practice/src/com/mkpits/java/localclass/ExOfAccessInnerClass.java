//access the inner class, create an object of the outer class, and then create an
// object of the inner class
package com.mkpits.java.localclass;

public class ExOfAccessInnerClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

 class MainClass {
    public static void main(String[] args) {
        ExOfAccessInnerClass myOuter = new ExOfAccessInnerClass();
        ExOfAccessInnerClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}

