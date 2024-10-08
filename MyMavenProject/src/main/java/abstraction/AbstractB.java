package abstraction;

public class AbstractB extends AbstractA {
public void display()
{
	System.out.print("helloo");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractB obj=new AbstractB();
		obj.show();
		obj.display();
	}

}
