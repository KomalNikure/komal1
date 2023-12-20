package classes2;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /* ArrayList<String>cars=new ArrayList<String>();
      cars.add("thar");
      cars.add("audi");
      cars.add("suzuki");
      cars.add("activa");

      Collections.sort(cars);

      for(String i:cars)
     {
	  System.out.println(i);
     }*/
		
		ArrayList<Integer>myNumbers=new ArrayList<Integer>();
		myNumbers.add(20);
		myNumbers.add(52);
		myNumbers.add(32);
		myNumbers.add(45);
		myNumbers.add(26);
		myNumbers.add(12);
		
		Collections.sort(myNumbers);
		
		for(int i : myNumbers)
		{
			System.out.println(i);
			
		
		}
	}

}
