class Parent

{

    void Do()

    {

        System.out.println("Parent's do executed");

    }

}

class Child extends Parent

{

    void Do()

    {

        super.Do();

    }

}

class 
Invoke
{
    
public static void main(String[] args)

    {

        Child x=new Child();

        x.Do();

    }

}