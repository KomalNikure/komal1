package classes2;

public class Outer 
{
 int x=10;
 class InnerClass
 {
	 int y=5;
 }


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Outer myOuter=new Outer();
Outer.InnerClass myInner=myOuter.new InnerClass();
System.out.println(myInner.y+myOuter.x);
	}

	
}


