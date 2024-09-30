package polymorphism;

public class SuperMethodB extends SuperMethod {
public void display()
{
	super.display();
	System.out.println("hellooo");
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
SuperMethodB obj=new SuperMethodB();
obj.display();
	}

}
