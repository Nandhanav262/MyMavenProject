package exceptionhandling;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String a="Haiiii";
			int b=Integer.parseInt(a);
			}
			catch(Exception e) {
				System.out.println("Exception Handled");
				System.out.println(e);
			}
				}

			}
