package classes2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern pattern=Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
Matcher matcher=pattern.matcher("Visit W3Schools!");
boolean matchFound=matcher.find();
if(matchFound) 
{
	System.out.println("match found");
}else 
{
	System.out.println("match not found");
}
	}

}
