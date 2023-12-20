package classes;

public class AccessMethod_Object {

	public void myMethod() 
	{
		System.out.println("the car is going fast");
	}
	
	public void speed(int maxSpeed) 
	{
		System.out.println("max speed is:"+maxSpeed);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessMethod_Object myObj=new AccessMethod_Object();
		myObj.myMethod();
		myObj.speed(1000);
	}

}
