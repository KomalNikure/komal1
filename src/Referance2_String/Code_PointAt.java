package Referance2_String;

public class Code_PointAt {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
String myStr="komal";
int result=myStr.codePointAt(4);
System.out.println(result);



int result1=myStr.codePointBefore(3);
System.out.println(result1);

int result2=myStr.codePointCount(0,5);
System.out.println(result2);
	}

}
