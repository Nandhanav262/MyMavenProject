package interfacenew;

public class MultipleInheritanceC implements MultipleInheritanceA,MultipleInheritanceB{
	public void show()
	{
		System.out.println("morning");
	}
	public void display()
	{
		System.out.println("evening");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceC obj=new MultipleInheritanceC();
		obj.show();
		obj.display();
		

	}

}
