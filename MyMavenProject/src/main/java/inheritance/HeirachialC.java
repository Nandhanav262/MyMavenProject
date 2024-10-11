package inheritance;

class HeirachialC extends HeirachialA
{
	public void run()
	{
		System.out.println("Okayy");
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HeirachialC obj=new HeirachialC();
		obj.run();
		HeirachialB obj1=new HeirachialB();
		obj1.display();
		obj1.show();

	}
	}
