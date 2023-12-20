package File;

import java.io.File;

public class Delete_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File myObj=new File("NewFile.txt");

if(myObj.delete())
{
	System.out.println("Delected the file:" +myObj.getName());
}
else 
{
	System.out.println("Failed to delete files");
}
	}

}
