import java.util.Scanner;
class ArrRev
{
int[] Rev(int[] arr,int i,int len)
{
int temp;
if(i>=len)
{
return arr;
}
arr=Rev(arr,i+1,len-1);
temp=arr[i];
arr[i]=arr[len];
arr[len]=temp;
return arr;
}
}
class ArrRevMain
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int len=s.nextInt();
int[] arr=new int[len];
for(int i=0;i<len;i++)
{
arr[i]=s.nextInt();
}
ArrRev ar=new ArrRev();
arr=ar.Rev(arr,0,len-1);
for(int i=0;i<len;i++)
{
System.out.println(arr[i]);
}
}
}