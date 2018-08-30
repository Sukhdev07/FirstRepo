final class Base

{

    void Display()

    {

        System.out.println("Class with final keyword cann not be inherited");

    }

}
class Child extends Base

{

    void Display()

    {

        System.out.println("Class with final keyword inherited");

    }

}

class NoExtend

{

    public static void main(String[] args)

    {

        Child c=new Child();

        c.Display();

    }

}