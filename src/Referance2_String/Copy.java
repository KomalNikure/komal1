package Referance2_String;

public class Copy {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
char[] mystr1= {'v','a','m','s','h','i'};
String mystr2="";
mystr2=mystr2.copyValueOf(mystr1,0,6);
System.out.println("returned string:" +mystr2);

	}

}
