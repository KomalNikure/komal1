package File;

import java.io.File;

public class GetFile_Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
File myObj=new File("WriterFile.txt");
{

if(myObj.exists())
	
{
	System.out.println("File Name:" +myObj.getName());
	System.out.println("Absolute Path:" +myObj.getAbsolutePath());
	System.out.println("Writeable:" +myObj.canWrite());
	System.out.println("Readable:"+myObj.canRead());
	System.out.println("File size in bytes:" + myObj.length());
	
	}

else 
	
{
	
	System.out.println("TheFile does not exist.");
}
	
}	

}
}