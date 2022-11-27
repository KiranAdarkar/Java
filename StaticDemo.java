
class StaticDemo
{
	static                    //gets called before main
	{
		System.out.println("Inside static block of StaticDemo class");
	}

	public StaticDemo()
	{
		System.out.println("Inside constructor of StaticDemo");
	}

	public static void main(String arg[])
	{
		System.out.println("Inside main");
		System.out.println("Value of static No3 : "+Demo.No3);
		System.out.println("Value of static No4 : "+Demo.No4);
		Demo.gun();

		Demo obj1 = new Demo();
		Demo obj2 = new Demo();

		obj1.fun();
	}
}

class Demo
{
	public int No1;                       //Non static characteristics
	public int No2;                       //Non static characteristics
	public static int No3;                //static characteristics
	public static int No4;                //static characteristics

	public Demo()                         //constructor
	{
		System.out.println("Inside constructor of Demo");
		No1 = 11;
		No2 = 21;
	}

	static                                //static block
	{
		System.out.println("Inside static block of Demo class");
		No3 = 51;
		No4 = 101;
	}

	public void fun()                     //Non static behavior
	{
		// Non static method can access static as well as non static data
		// we can use this keyword
		System.out.println("Inside non static method fun");
		System.out.println("Value of static No1 : "+this.No1);
		System.out.println("Value of static No2 : "+this.No2);
		System.out.println("Value of static No3 : "+this.No3);
		System.out.println("Value of static No4 : "+this.No4);
	}

	public static void gun()              //static behavior
	{
		// static method can access only static data
		// we can't use this keyword
		System.out.println("Inside static method gun");
		//System.out.println("Value of static No1 : "+No1);
		//System.out.println("Value of static No2 : "+No2);
		System.out.println("Value of static No3 : "+No3);
		System.out.println("Value of static No4 : "+No4);
	}
	
}