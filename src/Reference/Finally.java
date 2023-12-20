package Reference;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			int[] myNumber= {1,2,3};
			System.out.println(myNumber[10]);
		}
		catch(Exception e) 
		{
			System.out.println("something went wrong");
		}
		finally 
		{
			System.out.println("the try catcch finished");
		}
	}

}
