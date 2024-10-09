package interfacenew;

public class SameMethodC implements SameMethodA,SameMethodB{
public void show()
{
	System.out.println("haiii");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SameMethodC obj=new SameMethodC();
		obj.show();
	}

}
