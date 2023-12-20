package Basic_Java;

public class SumOf_ArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray= {10,12,25,8,19,23};
		int sum=0;
		int i;
		
		for(i=0; i<myArray.length; i++)
		{
			sum+=myArray[i];
		}
System.out.println("The sum is:" +sum);
	}

}
