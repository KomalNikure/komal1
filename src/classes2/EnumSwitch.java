package classes2;

import java.lang.System.Logger.Level;

enum level{
	ERROR,
	ALL,
	OFF
}
public class EnumSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level myVar=Level.ERROR;
		
		switch(myVar) 
		{
		case ERROR:
			System.out.println("ERROR level");
			break;
		case ALL:
			System.out.println("ALL level");
			break;
		case OFF:
			System.out.println("OFFlevel");
			break;
		}

	}

}
