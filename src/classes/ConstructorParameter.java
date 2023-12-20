package classes;

public class ConstructorParameter {
 private static ConstructorParameter myObj;
int x;
 
 public ConstructorParameter(int y) 
 {
	 x=y;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorParameter.myObj=new ConstructorParameter(5);
		System.out.println(myObj.x);
	}

}
