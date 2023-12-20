package classes2;

public class OuterClass {
 int x=10;
 
 static class Innerclass
 {
	 int y=25;

	public char[] myMethod() {
		// TODO Auto-generated method stub
		return null;
	}
 }
 
 public class Main{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Innerclass myInner=new OuterClass.Innerclass();
System.out.println(myInner.y);
	}

}
}