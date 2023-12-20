package Reference;

public class Static1 
{

	static void myStaticMethod() 
	{
		System.out.println("static method can handle without creating object");
	}
	
	public void myPublicMethod() 
	{
		System.out.println("public method can handle with creating object");
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
myStaticMethod();

/*myPublicMethod myObj=new myPublicmethod();
myObj.myPublicMethod();
	}*/

	}
}
