package Reference;

public class Vehicle {
 
	protected String band="Ford";
	
	public void honk() 
	{
		System.out.println("wwwwwooo");
	}
}

class Car extends Vehicle
{
	private String brand="zdo123";
	private String modelName="Thar";
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
 
		Car myFastCar=new Car();
        myFastCar.honk();
       System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	}

}
