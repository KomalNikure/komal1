package Reference;

public class Protected {
 protected String Fname="chetak";
 protected String lname="kambli";
 protected String email="kamblichetak@gmail.com";
 protected  int age=31;
}
 
 class Student extends Protected
 {
	 private int graduationyear=2015;
 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Student myObj= new Student();
System.out.println("Name:" + myObj.Fname+ " " + myObj.lname);
System.out.println("email:" + myObj.email);
System.out.println("age:" +myObj.age);
System.out.println("graduationyear:" +myObj.graduationyear);
	}

}
