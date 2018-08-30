class Animal

{
    String breed,color;
  
  void Speak()

    {
        
      System.out.println("Animal's Voice");

    }

}

class Dog extends Animal

{
 
   void Speak()

    {
 
       System.out.println("Dog Barks");

        breed="Pitbull";

        color="White";

    }

}

class Cat extends Animal

{

    void Speak()

    {

        System.out.println("Cat Meows");

        breed="Manicoon";

        color="White";

    }

}

class AnimalInfo

{

    public static void main(String[] args)

    {

        Dog obj=new Dog();

        Cat ob=new Cat();

        obj.Speak();

        System.out.println("I own a dog named Sandy. He is a "+obj.breed+" and is "+obj.color+" in color." );

        ob.Speak();

        System.out.println("I also own a cat named Venus. She is a "+ob.breed+" and is "+ob.color+" in color." );

    }

}