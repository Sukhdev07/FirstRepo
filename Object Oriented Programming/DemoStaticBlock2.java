import java.util.Scanner;

class College

{

    int year;

    static String stream;

    static

    {

        stream="CSE";

    }

}

class DemoStaticBlock2

{

    public static void main(String[] args)

    {

        College c1=new College();

        c1.year=2015;

        College c2=new College();

        c2.year=2016;

        System.out.println("Student is of year "+c1.year+" of stream "+c1.stream);

        System.out.println("Student is of year "+c2.year+" of stream "+c2.stream);

    }

}