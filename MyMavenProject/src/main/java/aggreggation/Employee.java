package aggreggation;

public class Employee {
int id;
String name;
Details details ;
Employee(int id,String name,Details details)
{
	this.id=id;
	this.name=name;
	this.details=details;
}
public void show()
{
	System.out.println(details.city);
	System.out.println(details.state);
	System.out.println(details.country);
	System.out.println(name);
	System.out.println(id);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Details obj=new Details("aluva","kerala","india");	
Employee obj1=new Employee(212,"Ammu",obj);
obj1.show();
	}

}
