import java.util.Scanner;
class InfoSibling
{
    String name;
    static String stream;
    int year;
    static
    {
        stream="CSE";
    }
}
class DemoStaticBlock
{
    public static void main(String[] args)
    {
        InfoSibling a=new InfoSibling();
        a.name="Sukhdev";
        a.year=2016;
        InfoSibling b=new InfoSibling();
        b.name="Monish";
        b.year=2016;
        System.out.println(a.name+" is of stream "+a.stream+" of batch "+a.year);
        System.out.println(b.name+" is of stream "+b.stream+" of batch "+b.year);
    }
}