package classes;

public class Multiple_Object {

	int x=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_Object myObj =new Multiple_Object();
		Multiple_Object myObj2=new Multiple_Object();
         myObj2.x=125;
         System.out.println(myObj.x);
         System.out.println(myObj2.x);
	}

}
