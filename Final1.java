// SAME as constant characteristics of class from C++

class Final1
{
	public static void main(String arr[])
	{
		final int i = 51;             // const int i = 51;
		Demo obj = new Demo();
		obj.No1++;
		// obj.No2++;                               NA
		// obj.No3++;                               NA
	}
}

class Demo  
{
	public int No1;
	public final int No2 = 11;          // const int No2; 
	public final int No3;               // const int No3;
	
	public Demo()
	{
		No1 = 0;
		No3 = 21;                       // NA in C++
	}
}