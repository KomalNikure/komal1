package classes2;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ArrayList<String>cars=new ArrayList<String>();
		cars.add("BMW");
		cars.add("THAR");
		cars.add("LOBARGINI");
		cars.add("NEXA");
		//cars.set(3, "AUDI");
		//cars.clear();
		//cars.size();
		//cars.remove(2);
		//System.out.println(cars);
		//System.out.println(cars.size());
		//System.out.println(cars.get(0))*/
		
		
		/*for(int i=0;i<cars.size();i++) //loop through an arraylist
		{
			System.out.println(cars.get(i));
		}*/
		
		
		/*for (String i : cars)
		{
		      System.out.println(i);
		    }*/
		
		ArrayList<Integer>myNumbers=new ArrayList<Integer>();
		myNumbers.add(10);
		myNumbers.add(20);
		myNumbers.add(30);
		myNumbers.add(50);
		myNumbers.add(60);
		for(int i:myNumbers) 
		{
			System.out.println(i);
		}
	}

}
