//Java anonymous inner class example using interface
package com.mkpits.java.localclass;

interface AnonymousInnerClassUsingInterface {
    void eat();
}
class TestAnonymousInner1 {
    public static void main(String args[]) {
        AnonymousInnerClassUsingInterface e = new AnonymousInnerClassUsingInterface() {
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        e.eat();
    }
}
