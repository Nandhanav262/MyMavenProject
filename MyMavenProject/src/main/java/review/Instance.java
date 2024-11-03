package review;

public class Instance {
	public void show(int a,int b)
	{
	
		System.out.println(a+" "+b);
	}
	public int add()
	{
		int a=2;
		int b=4;
		int c;
		c=a+b;
		return c;
	}
public void display(int a,int b) {
	int c=a+b;
	System.out.println(c);
}
public int run(int a,int b)
{
	int c=a+b;
	return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instance obj=new Instance();
obj.show(3,4);
System.out.println(obj.add());
obj.display(4,7);
System.out.println(obj.run(3,6));

	}

}
