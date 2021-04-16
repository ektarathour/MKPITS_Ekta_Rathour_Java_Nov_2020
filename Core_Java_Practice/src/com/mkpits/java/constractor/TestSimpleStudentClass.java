//WAP to  class student having rno name
class student
{
int rno;
String name;
}
class TestSimpleStudentClass
{
public static void main(String[] args)
{
student s1=new student();
student s2=new student();
s1.rno=123;
s1.name="ekta";
s2.rno=134;
s2.name="rani";
System.out.println("rno of first student" +s1.rno);
System.out.println("name of first student" +s1.name);
System.out.println("rno of second student" +s2.rno);
System.out.println("name of second student" +s2.name);
}
}
