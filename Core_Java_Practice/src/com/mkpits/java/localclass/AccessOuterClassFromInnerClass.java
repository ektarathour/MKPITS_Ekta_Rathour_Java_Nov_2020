//A java Program Access Outer Class From Inner Class
package com.mkpits.java.localclass;

public class AccessOuterClassFromInnerClass {
    int x = 10;

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}

class Main {
    public static void main(String[] args) {
        AccessOuterClassFromInnerClass myOuter = new AccessOuterClassFromInnerClass();
        AccessOuterClassFromInnerClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}

