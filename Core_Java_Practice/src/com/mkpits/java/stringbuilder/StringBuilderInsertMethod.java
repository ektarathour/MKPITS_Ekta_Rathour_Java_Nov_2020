//StringBuilder insert() method
package com.mkpits.java.stringbuilder;

class StringBuilderInsertMethod
{
    public StringBuilderInsertMethod(String hello) {
    }

    public static void main(String[] args)
{
StringBuilderInsertMethod sb=new StringBuilderInsertMethod("Hello");
sb.insert(1,"java");//now original string is changed
System.out.println(sb);//print Hello java
}

    private void insert(int i, String java) {
    }
}