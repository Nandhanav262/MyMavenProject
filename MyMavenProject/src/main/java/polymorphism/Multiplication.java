package polymorphism;

public class Multiplication {

	int a,b,c;
	Multiplication(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void show()
	{
		int result=a*b*c;
		System.out.println("mul="+result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multiplication obj=new Multiplication(4,6,8);
obj.show();
	}

}
