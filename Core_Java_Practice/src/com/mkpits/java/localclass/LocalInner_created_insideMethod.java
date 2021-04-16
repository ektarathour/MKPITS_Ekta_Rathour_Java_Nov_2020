//WAP to local inner class example
package com.mkpits.java.localclass;

public class LocalInner_created_insideMethod {
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
        LocalInner_created_insideMethod obj = new LocalInner_created_insideMethod();
        obj.display();
    }
}
