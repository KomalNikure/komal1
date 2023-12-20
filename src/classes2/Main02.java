package classes2;

public class  Main02 implements Runnable 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Main02 obj=new Main02();
Thread thread = new Thread(obj);
thread.start();
System.out.println("this code is outside of code");
	}
	
public void run()
{
	System.out.println("this code is running in a thread");
}
}
