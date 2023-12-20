package methodOverloading;

public class Overloading {

	static int Method1(int a,int b) 
	{
		return a+b;
	}
	
	static double Method2(double x, double y)
	{
		return x+y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myValue=Method1(4,5);
		double myvalue=Method2(10,12);
		
		System.out.println("int" + myValue);
		System.out.println("double" + myvalue);
	}

}
