package Basic_Java;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalStr="chandrapur";
		String reversedStr="";
		
		
		System.out.println("original string:"+originalStr);
		
		for(int i=0; i < originalStr.length(); i++)
		{
			reversedStr=originalStr.charAt(i)+reversedStr;
		}
		
		System.out.println("Reversed String:" +reversedStr);
	}

}
