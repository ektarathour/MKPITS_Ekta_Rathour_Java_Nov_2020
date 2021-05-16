//Understanding Real use of instanceof in java
package com.mkpits.java.instanceofoperatoranddowncasting;

interface RealUseOfInstanceOfOperator {
    class A implements RealUseOfInstanceOfOperator {
        public void a() {
            System.out.println("a method");
        }
    }

    class B implements RealUseOfInstanceOfOperator {
        public void b() {
            System.out.println("b method");
        }
    }

    class Call {
        void invoke(RealUseOfInstanceOfOperator p) {//upcasting
            if (p instanceof A) {
                A a = (A) p;//Downcasting
                a.a();
            }
            if (p instanceof B) {
                B b = (B) p;//Downcasting
                b.b();
            }
        }
    }

//end of Call class

    static class Test4 {
        public static void main(String args[]) {
            RealUseOfInstanceOfOperator p = new B();
            Call c = new Call();
            c.invoke(p);
        }
    }
}

