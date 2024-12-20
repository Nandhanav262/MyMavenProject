package methodoverloading;

public class Static {

	public static void show()
	{
		System.out.println("hello");
	}
	public static void show(float a,int b)
	{
		float c=a+b;
		System.out.println(c);
	}
	public static void main(String args[])
	{
		Static.show();
		Static.show(5.00f,3);
	}

}
