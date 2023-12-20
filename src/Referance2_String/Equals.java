package Referance2_String;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
String myStr1="hello";
String myStr2="hello";
String myStr3="Another String";

System.out.println(myStr1.equals(myStr2));
System.out.println(myStr1.equals(myStr3));

System.out.println(myStr1.equalsIgnoreCase(myStr2));
System.out.println(myStr2.equalsIgnoreCase(myStr3));
System.out.println(myStr1.equalsIgnoreCase(myStr3));


	}

}
