package recursion;

public class RecursionFunction {
 public static int sum(int k) 
 {
	 if(k>0)
	 {
		 return k+sum(k-1);
	 }
	 else
	 {
		 return 0;
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int result =sum(10);
     System.out.println( result);
     
     int result2 =div(20);
     System.out.println(result2);
    		 
	}

	
	public static int div(int k) 
	{
		if(k<100) 
		{
			return k-div(k+1);
		}
		else {
			return 0;
		}
	}
}
