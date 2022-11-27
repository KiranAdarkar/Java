// Interface is a blueprint of a class which has all abstract methods in it
// Interface achieves 100 % abstraction

class InterfaceDemo
{
	public static void main(String Arr[])
	{
		System.out.println("Value of PI is : "+Circle.PI);  // to demonstrate public and static
		// Circle.PI = 7.12f;                               // to demonstrate final      //  NA
		float Ret = 0.0f;
		Circle cobj = new Marvellous();
		Ret = cobj.Area(10.5f);
		System.out.println("Area is : "+Ret);
		Ret = cobj.Circumferance(10.5f);
		System.out.println("Circumferance is : "+Ret);
	}
}

interface Circle
{
	float PI = 3.14f;                  // public static final float PI = 3.14f;

	float Area(float Radius);       // public abstract float Area(float Radius);
	float Circumferance(float Radius);     // public abstract float Circumferance(float Radius);
}

class Marvellous implements Circle
{
	public float Area(float Radius)
	{
		return PI * Radius * Radius;
	}

	public float Circumferance(float Radius)
	{
		return 2 * PI * Radius;
	}
}