package Reference;

public class Private {

	private String fname="purvesh";
	private String lname="nikode";
	private String email="purvesh@gmail.com";
	private int age=07;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Private myObj=new Private();
		System.out.println("Name:" + myObj.fname+ "" +myObj.lname);
		System.out.println("email:" + myObj.email);
		System.out.println("age:" +myObj.age);
		

	}

}
