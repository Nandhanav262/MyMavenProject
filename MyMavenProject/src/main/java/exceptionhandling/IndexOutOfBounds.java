package exceptionhandling;

public class IndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[10]=3;
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
			}

		}