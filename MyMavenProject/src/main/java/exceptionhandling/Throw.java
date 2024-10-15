package exceptionhandling;

public class Throw {

	public void validate(int age)
	{
		if(age<18) {
			throw new ArithmeticException("Not Eligible");
		}
		else {
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throw obj=new Throw();
		obj.validate(20);
	}

}
