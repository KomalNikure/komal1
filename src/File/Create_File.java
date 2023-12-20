package File;

import java.io.File;
import java.io.IOException;

public class Create_File {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
try {
	File myObj=new File("filename.txt");
	
	if(myObj.createNewFile()) 
	{
		System.out.println("File Created:"+myObj.getName());
	}
	else 
	{
		System.out.println("File already exist.");
	}
}
	catch(IOException e)
	{
		System.out.println("An error occured");
		e.printStackTrace();
	}
}
	}


