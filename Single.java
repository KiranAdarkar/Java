class Single
{
     public static void main(String arg[])
     {
          // Base bobj1 = new Base();              // No Casting
          // Derived dobj1 = new Derived();        // No Casting
          Base bobj2 = new Derived();           // Upcasting
          // Derived dobj2 = new Base();           // Downcasting - N/A

          // dobj1.fun();
          // dobj1.fun(11);
          // dobj1.gun();
          // dobj1.sun();

          bobj2.fun();
          bobj2.fun(11);
          bobj2.gun();
          // bobj2.sun();
     }
}

/*
class Object      // present in java.lang package(By default imported package)
{
       // Code
}
*/

class Base                          // class Base extends Object(internally)
{
    public int A,B;
    public Base()
    {
        System.out.println("Base Constructor");
        this.A = 10;
        this.B = 20;
    }
    public void fun()                     // Definition
    {
          System.out.println("Inside Base fun");
    }
    public void gun()                     // Definition
    {
          System.out.println("Inside Base gun");
    }
    public void fun(int No)             // Overloaded Definition
    {
          System.out.println("Inside Base fun with one integer");
    }
}

class Derived extends Base            // class Derived : public Base  <-- C++
{
    public int X,Y;

    public Derived()
    {
        System.out.println("Derived Constructor");
        this.X = 30;
        this.Y = 40;
    }
    public void sun()                    // Definition
    {
        System.out.println("Inside Derived sun");
    }
    public void gun()                    // Overrided Definition
    {
        System.out.println("Inside Derived gun");
    }
}