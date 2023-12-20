package Reference;

public class Animal2 {

	public void animalSound() 
	{
		System.out.println("the animl make a sound");
	}
}

class Dog extends Animal2
{
	public void animalSound() 
	{
		super.animalSound();
		System.out.println("the dog say: bow bow");
	}
	}

/*public class Animal
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dog myDog=new Dog();
		myDog.animalSound();

	}
}*/

