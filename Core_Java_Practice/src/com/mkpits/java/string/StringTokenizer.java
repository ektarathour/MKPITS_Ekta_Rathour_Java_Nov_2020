//WAP to String Tokenizer class
package com.mkpits.java.string;
public class StringTokenizer
{


    public StringTokenizer(String my_name_is_mayuri, String s) {
    }


    public static void main(String[] args)
{
StringTokenizer st=new StringTokenizer("my name is mayuri"," ");
while(st.hasMoreTokens()) {
    System.out.println(st.nextToken());
}
}

    private boolean nextToken() {
        return false;
    }

    private boolean hasMoreTokens() {
        return false;
    }
}

