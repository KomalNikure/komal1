package classes2;

import java.text.Format;

interface StringFunction
{
	String run(String Str);
}
public class LambdaMethod_Parameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringFunction exclaim=(s) ->s+ "!" ;
StringFunction ask=(s) ->s+ "!";
printFormatted("Hello",exclaim);
printFormatted("hello",ask);
	}
public static void printFormatted(String Str,StringFunction format) 

{
	
	String result=format.run(Str);
	System.out.println(result);
}
}
