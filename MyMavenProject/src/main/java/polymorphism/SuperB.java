package polymorphism;

public class SuperB extends SuperA
{
	String name="vasu";
	public void show()
	{
		System.out.println(super.name);
		System.out.println(name);
	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
SuperB obj=new SuperB();
obj.show();
	}
}
