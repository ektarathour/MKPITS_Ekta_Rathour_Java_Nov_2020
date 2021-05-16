//access level of a private modifier is only within the class. It cannot be accessed from
//outside the class.
package com.mkpits.java.accessmodifier;

public class ExOfPrivateAccessModifier {
    private int a=20;

    private void msg(){System.out.println("Hello" + a);}
    public void showmsg()
    {

        a=40;
        msg();
    }
}

class test
{
    public static void main(String[] arg)
    {

        ExOfPrivateAccessModifier ex=new ExOfPrivateAccessModifier();
//ex.a=40;
//ex.msg();
        ex.showmsg();
    }
}
