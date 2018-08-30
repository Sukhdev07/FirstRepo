abstract class Vehicle

{

    abstract void Start();

    void Stop()

    {

        System.out.println("Stop");

    }

}

class TwoWheeler extends Vehicle

{

    void Start()

    {

        System.out.println("In start of two wheeler");

    }

    void Stop()

    {

        System.out.println("In stop of two wheeler");

    }

}

class FourWheeler extends Vehicle
{

    void Start()

    {

        System.out.println("In start of four wheeler");

    }
 
    void Stop()

    {

        System.out.println("In stop of four wheeler");

    }

}

class Instructions

{

    public static void main(String[] args)

    {

        TwoWheeler t=new TwoWheeler();

        FourWheeler f= new FourWheeler();

        t.Start();

        t.Stop();

        f.Start();

        f.Stop();

    }

    
}