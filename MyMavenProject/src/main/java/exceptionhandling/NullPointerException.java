package exceptionhandling;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String a=null;
			System.out.println(a.length());
			}
			catch(Exception e) {
				System.out.println("Exception Handled");
				System.out.println(e);
			}
				}

			}