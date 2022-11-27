class Overloading
{
     public static void main(String a[])
     {
         Demo obj = new Demo();
         obj.fun();
         obj.fun(11);
         obj.fun(11,21);
         obj.fun(21,51);
         obj.fun(3.14);
     }
}

class Demo                         
{
    public void fun()                     
    {
          System.out.println("fun without parameter");
    }
    public void fun(int i)                     
    {
          System.out.println("fun with one integer");
    }
    public void fun(int i, int j)             
    {
          System.out.println("fun with two integers");
    }
    public void fun(double i)             
    {
          System.out.println("fun with one double");
    }
}

