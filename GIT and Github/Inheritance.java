import java.util.Scanner;
class Human
{
String name;
Human()
{
name="Sukhdev";
}
}
class Student extends Human
{
int roll_no;
Student()
{
roll_no=1433;
}
}
class Inheritance
{
public static void main(String[] args)
{
Student s=new Student();
System.out.println(s.name);
}
}