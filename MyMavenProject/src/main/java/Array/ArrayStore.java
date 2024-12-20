package Array;

public class ArrayStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[10];
int sum=0;
arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
arr[4]=5;
arr[5]=6;
arr[6]=7;
arr[7]=8;
arr[8]=9;
arr[9]=10;
for(int i=0;i<arr.length;i++)
{
	sum+=arr[i];
}
	System.out.println("sum is:"+ sum);

	}

}
