// abstract class is a class which contains 0 or more abstract method in it
// abstract class achieves 0 to 100 % abstraction

class AbstractDemo
{
	public static void main(String Arr[])
	{
		// Arithmetic aobj = new Arithmetic();             NA
		Arithmetic aobj = new Marvellous();             // Allowed  Upcasting

		Marvellous mobj = new Marvellous();
		int Ret = 0;
		Ret = mobj.Addition(11,10);
		System.out.println("Addition is : "+Ret);
		Ret = mobj.Subtraction(11,10);
		System.out.println("Subtraction is : "+Ret);
	}
}

abstract class Arithmetic
{
	public int Addition(int No1, int No2)
	{
		return No1 + No2;
	}
	public abstract int Subtraction(int No1, int No2);
	// virtual int Subtraction(int No1, int No2) = 0;
}

class Marvellous extends Arithmetic
{
	public int Subtraction(int No1, int No2)
	{
		return No1 - No2;
	}
}