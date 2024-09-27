package polymorphism;

public class C 
{
public float show(int a,float b)
{
	float e=a+b;
	return e;
}

public float show(float b,int a)
{
	float d=a-b;
	return d;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj=new C();
System.out.println("sum is="+obj.show(3,7.6f));
System.out.println("sub is="+obj.show(7.6f,6));
	}

}
