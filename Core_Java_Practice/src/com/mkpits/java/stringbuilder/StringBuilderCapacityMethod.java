//WAP to StringBuilder capacity method
package com.mkpits.java.stringbuilder;

class StringBuilderCapacityMethod {
    public static void main(String[] args) {
        StringBuilderCapacityMethod sb = new StringBuilderCapacityMethod();
        System.out.println(sb.capacity());
        sb.append("hello");
        System.out.println(sb.capacity());
        sb.append("java is my favorite language");
        System.out.println(sb.capacity());
    }

    private void append(String hello) {
    }

    private boolean capacity() {
        return false;
    }
}
