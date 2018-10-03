//Checks if the string is Palidrome
import java.util.Scanner;
class Palindrome
{
int Pal(char[] arr,int i,int j)
{
int flag=0;
if(i>=j)
{
if(arr[i]==arr[j])
{
flag=1;
}
else
{
flag=0;
}
return flag;
}
flag=Pal(arr,++i,--j);
if(flag==0)
{ return 0;}
if(flag==1)
{
if(arr[i]==arr[j])
{
flag=1;
}
else
{
flag=0;
}
}
return flag;
}
}
class PalMain
{
public static void main(String[] args)
{
String str=new String();
Scanner s=new Scanner(System.in);
str=s.next();
int i=0,x;
int j=str.length()-1;
char[] arr=str.toCharArray();
Palindrome p=new Palindrome();
x=p.Pal(arr,i,j);
if(x==1)
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not Palindrome");
}
}
}



