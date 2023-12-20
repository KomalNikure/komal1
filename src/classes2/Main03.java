package classes2;

public class Main03 extends Thread 
{

	public static int amount=0;
	
	public static void main(String[] args)
	
	{
	
Main03 thread=new Main03();
thread.start();

// Wait for the thread to finish
while(thread.isAlive()) 
{
System.out.println("Waiting...");
}

/*
System.out.println(amount);
amount++;
System.out.println(amount);  */



//Update amount and print its value
System.out.println("Main: " + amount);
amount++;
System.out.println("Main: " + amount);
}
	

	public void run() 
	{
		amount++;
	}
}
