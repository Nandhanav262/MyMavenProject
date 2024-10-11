package exceptionhandling;

public class ArithmaticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
int a=10/0;
}
catch(Exception e) {
	System.out.println("Exception Handled");
	System.out.println(e);
}
	}

}
