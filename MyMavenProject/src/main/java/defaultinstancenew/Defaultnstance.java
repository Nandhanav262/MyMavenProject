package defaultinstancenew;

public class Defaultnstance {
	
	int value1;
	int value2;
	Defaultnstance(int a,int b){
		value1=a;
		value2=b;
	}
public void show()
{
	int c=value1+value2;
	System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Defaultnstance obj=new Defaultnstance(3,5);
		obj.show();
	}

}
