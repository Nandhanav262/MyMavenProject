package polymorphism;

public class Employee {
	String name;
	int age;
	Float salary;
	Employee(String name,int age,float salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public void show()
	{
		System.out.println("Employee name="+name);
		System.out.println("Employee age="+age);
		System.out.println("Employee salary="+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee obj=new Employee("appu",22,345.0f);
obj.show();
	}

}
