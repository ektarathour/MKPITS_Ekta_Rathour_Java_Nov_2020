//WAP to local inner class example
package com.mkpits.java.localclass;

public class LocalInnerCreatedInsideMethod {
    private int data = 30;//instance variable

    void display() {
        class LocalInner {
            void msg() {
                System.out.println(data);
            }
        }
        LocalInner l = new LocalInner();
        l.msg();
    }

    public static void main(String[] args) {
        LocalInnerCreatedInsideMethod obj = new LocalInnerCreatedInsideMethod();
        obj.display();
    }
}
