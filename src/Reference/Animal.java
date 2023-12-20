package Reference;

public interface Animal {
public void animalSound();
public void sleep();
}
class Pig implements Animal
{
	public void animalSound()
	{
		System.out.println("the pig say we we");
	}
	
	public void sleep()
	{
		System.out.println("zzzzzzzzzzz");
	}
}
	class Main
	{
		public static final String x = null;

		public static void main(String[]args) 
		{
			Pig myPig=new Pig();
			myPig.animalSound();
			myPig.sleep();
		}
	}
