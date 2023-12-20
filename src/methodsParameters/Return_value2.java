package methodsParameters;

public class Return_value2 {

	static int myMethod(int a,int b) 
	{
		return a+b;
	}
	
	static int myMethod2(int x, int y) 
	{
		return x+y;
	}
	
	static int myMethod3(int k,int v) 
	{
		return k+v;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int c=myMethod(8,9);
      System.out.println(c);
      
      
      int z=myMethod2(12,4);
      System.out.println(z);
 
      int r=myMethod3(8,3);
      System.out.println(r);
	}

}
