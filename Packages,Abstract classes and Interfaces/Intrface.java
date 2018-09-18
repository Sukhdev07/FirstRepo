 interface Animal
{
  
  void speak();

  void eat();

}

class Dog implements Animal
{

   public void speak()
{

    System.out.println("Dog barks");

  }

   public void eat()
{
 
   System.out.println("Dog eats");

  }

}
class Cat implements Animal
{

  public void speak()
{

    System.out.println("Cat Meow");

  }

  public void eat()
{

    System.out.println("Cat eats");

  }

}

 class Intrface
{

  public static void main(String[] args)
{

    Animal d=new Dog();

    Animal c=new Cat();

    d.speak();

    d.eat();

    c.speak();

    c.eat();

  }

}
