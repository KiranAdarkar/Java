class RMD
{
     public static void main(String a[])
     {
         Base bobj = new Derived();             // Upcasting

         bobj.fun();                  // Derived fun
         bobj.gun();                  // Derived gun
         bobj.sun();                  // Base sun
         // bobj.run();                  // error
     }
}

class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }
    public void gun()
    {
        System.out.println("Base gun");
    }
    public void sun()
    {
        System.out.println("Base sun");
    }
}

class Derived extends Base                         
{
    public void fun()
    {
        System.out.println("Derived fun");
    }
    public void gun()
    {
        System.out.println("Derived gun");
    }
    public void run()
    {
        System.out.println("Base run");
    }
}

