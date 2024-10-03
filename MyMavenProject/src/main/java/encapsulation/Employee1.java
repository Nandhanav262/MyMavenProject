package encapsulation;

public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee obj= new Employee();
obj.setName("appu");
obj.setAge(22);
obj.setSalary(345.00f);
System.out.println(obj.getName());
System.out.println(obj.getAge());
System.out.println(obj.getSalary());
	}

}
