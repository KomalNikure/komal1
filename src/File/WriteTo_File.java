package File;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTo_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
FileWriter myWriter=new FileWriter("WriterFile.txt");

myWriter.write("Files in Java might be tricky, but it is fun enough!");
myWriter.close();

System.out.println("Successfully wrote to the file.");

	}
		
		catch(IOException e)
		{
			System.out.println("an error occured");
			e.printStackTrace();
			}
		}

}
