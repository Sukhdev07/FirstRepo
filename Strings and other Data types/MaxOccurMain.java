import java.util.Scanner;
class MaxOccur
{
void MaxCheck()
{
String str=new String();
Scanner s=new Scanner(System.in);
str=s.next();
char[] arr=str.toCharArray();
int max=0,pos=0,i,j,prev=0;
for(i=0;i<arr.length;i++)
{
max=0;
for(j=0;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
++max;
}
}
if(max>prev)
{
prev=max;
pos=i;
}
}
System.out.println(arr[pos]+" occurs maximum no. of times in String");
}
}
class MaxOccurMain
{
public static void main(String[] args)
{
MaxOccur m=new MaxOccur();
m.MaxCheck();
}
}