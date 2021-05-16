

//WAP Static binding example

package com.mkpits.java.binding;
class DogStaticBinding
{
private void eat()
{
System.out.println("Dog is eating");
}
public static void main(String[] args)
{
DogStaticBinding d=new DogStaticBinding();
d.eat();
}
}