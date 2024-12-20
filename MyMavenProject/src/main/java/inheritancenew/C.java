package inheritancenew;

public class C extends A {
	public void display() {
		System.out.println("morning");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		obj.display();
		obj.show();
		B obj1=new B();
		obj1.find();
		obj1.show();

	}

}
