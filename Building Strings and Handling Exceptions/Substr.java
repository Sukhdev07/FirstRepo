import java.util.Scanner;

public class Substr
{

  public static void main(String[] args)
{

    Scanner s=new Scanner(System.in);

    System.out.println("Enter a string");

    String st=s.nextLine();

    char[] ch=st.toCharArray();
    int size=st.length();

    int i,j,k;

    System.out.println("Substrings are");
 
   for(i=0;i<size;i++)
{

      for(j=0;j<=i;j++)
{


       for(k=j;k<=i;k++)
{
System.out.print(ch[k]);
}
System.out.println();       
      }

    }

  }

}
