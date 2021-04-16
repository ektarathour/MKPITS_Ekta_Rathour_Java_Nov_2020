//WAP to covariant return type
package com.mkpits.java.multipalprograms;


class CovariantType
{
CovariantType get()
  {
  return this;
  }
}
class CovariantTypeEx extends CovariantType
{
  CovariantTypeEx get()
  {
  return this;
  }
  void message(){System.out.println("welcome to covariant return type");}
  public static void main(String[] args)
  {
  new CovariantTypeEx().get().message();
  }
}