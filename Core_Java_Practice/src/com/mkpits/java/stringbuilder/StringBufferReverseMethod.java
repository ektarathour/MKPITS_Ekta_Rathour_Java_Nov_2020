//WAP to StringBuilder reverse()method
package com.mkpits.java.stringbuilder;

class StringBufferReverseMethod {
    public StringBufferReverseMethod(String hello) {
    }

    public static void main(String[] args) {
        StringBufferReverseMethod sb = new StringBufferReverseMethod("Hello");
        sb.reverse();//now original string is changed
        System.out.println(sb);
    }

    private void reverse() {
    }
}