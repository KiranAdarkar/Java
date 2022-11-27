import java.util.*;

class ThrowsDemo
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

		int iNo1 = 0, iNo2 =0, iAns = 0;

		System.out.println("Enter first number");
		iNo1 = sobj.nextInt();
		System.out.println("Enter second number");
		iNo2 = sobj.nextInt();

		Arithmetic aobj = new Arithmetic();

        try
		{
			int Ret = aobj.Division(iNo1,iNo2);
			System.out.println("Division is : "+Ret);
		}

		catch(ArithmeticException obj)
		{
			System.out.println("Exception occured");
			System.out.println(obj);          
		}
    }
}

class Arithmetic
{
    public int Division(int A, int B) throws ArithmeticException
    {
        int Ans = 0;
        Ans = A / B;
        return Ans;
    }
}