package classes2;

public class Exception1 {

	static void checkAge(int age)
	{
		if(age<18)
		{
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		}
	
	else
	{
		 System.out.println("Access granted - You are old enough!"); 
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// checkAge(12); 
		 checkAge(19);

	}
	
}
