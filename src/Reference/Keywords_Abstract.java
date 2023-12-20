package Reference;

public abstract class Keywords_Abstract {

	public String fname="purvesh";
	public int age=25;
	public abstract void study();
	
	abstract class Student extends Keywords_Abstract
	{
		public int graduationYear=2017;
		public  void study()
		{
			System.out.println("studying all day long");
		}
		
		}
	
	class Second
	{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Student myObj=new Student();

System.out.println("Name:" +myObj.fname);
System.out.println("Age:" +myObj.age);
System.out.println("GraduationYear" +myObj.graduationYear);
myObj.study();
*/

	}

}
}