package File;

import java.io.File;
import java.io.IOException;

public class Create_FilePath {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
try {
	
	File myObj=new File("C:\\FilePath\\CreateFile\\NewFile.txt");
	
	
	if(myObj.createNewFile()) 
	{
		System.out.println("File Created:"  +myObj.getName());
		System.out.println("Absolute Path:" +myObj.getAbsolutePath());
	}

	else 
	{
		System.out.println("File Already Exist");
	}
}
	catch(IOException e) 
	{
		System.out.println("An Error Occured");
		e.printStackTrace();
	}

	}

}
