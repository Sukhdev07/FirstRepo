abstract class Animals
{
  String breed,colour,name;

  abstract void eat(String b,String c,String n);

  void speak()
{

    System.out.println("Animals speak");

  }

}

class Dog extends Animals
{

  void eat(String b,String c,String n)
{
    
   breed=b;

    colour=c;

    name=n;

    System.out.println("Name is "+name+"  Breed is "+breed+" And Colour is "+colour);

  }

  void speak()
{

    System.out.println("Dogs bark");

  }

}

public class Abstrct
{

  public static void main(String[] args)
{

    Animals d=new Dog();

    d.eat("Husky","Black","Sandy");

    d.speak();

  }

}
