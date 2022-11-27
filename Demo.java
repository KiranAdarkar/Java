
class Maths
{
	public int iNo1;            // Characteristics
	public int iNo2;            // Characteristics
	
	public Maths()              // Default Constructor
	{
		System.out.println("Inside Default Constructor");
		int iNo1 = 0;
		int iNo2 = 0;
	}
	public Maths(int a, int b)    // Parameterised Constructor
	{
		System.out.println("Inside Parameterised Constructor");
		int iNo1 = a;
		int iNo2 = b;
	}
	public int Addition()         // Behavior
	{
		int iAns = 0;
		iAns = iNo1 + iNo2;
		return iAns;
	}
	public int Subtraction()       // Behavior
	{
		int iAns = 0;
		iAns = iNo1 - iNo2;
		return iAns;
	}
}  // End of Maths class

class Demo
{
	public static void main(String arr[])
	{
		System.out.println("Inside main function");

		Maths mobj1 = new Maths();
		Maths mobj2 = new Maths(10,11);

		int iRet = 0;
		iRet = mobj1.Addition();
		System.out.println("Addition is : "+iRet);

		iRet = mobj2.Addition();
		System.out.println("Addition is : "+iRet);

	}
}