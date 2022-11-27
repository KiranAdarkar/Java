// this concept is not present in C++

class Final2
{
	public static void main(String arr[])
	{
		Base bobj = new Derived();
	}
}

class Base 
{
	public void fun()
	{
		System.out.println("Base fun");
	}
	public final void gun()                   // final behavior
	{
		System.out.println("Base gun");
	}
}

class Derived extends Base
{
	public void fun()
	{
		System.out.println("Derived fun");
	}
	/*
	public void fun()
	{
		System.out.println("Derived gun");          // NA
	}
	*/
}