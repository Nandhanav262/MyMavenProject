package defaultinstance;

public class Instance {
public void display(int a,String b)
{
	System.out.println(a);
	System.out.println(b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instance obj=new Instance();
obj.display(2,"haiii");
	}

}
