package com.mkpits.java.stringbuilder;

//WAP to stringBuilder ensureCapacity Method
class StringBuilderensureCapacity {
    public static void main(String[] args) {
        StringBuilderensureCapacity sb = new StringBuilderensureCapacity();
        System.out.println(sb.capacity());
        sb.append("hello");
        System.out.println(sb.capacity());
        sb.append("java is my favorite language");
        System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }

    private void ensureCapacity(int i) {
    }

    private void append(String java_is_my_favorite_language) {
    }

    private boolean capacity() {
        return false;
    }
}
