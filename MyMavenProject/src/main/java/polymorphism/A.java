package polymorphism;

class A {
	public void show(int a,int b)
	{
		System.out.println(a+" "+b);
	}
	public void show(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.show(2,4);
		obj.show(8);

	}

}
