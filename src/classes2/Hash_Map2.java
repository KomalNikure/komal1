package classes2;

import java.util.HashMap;

public class Hash_Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap<String,Integer>people=new HashMap<String,Integer>();
 people.put("KOMAL", 27);
 people.put("VAM", 06);
 people.put("KIAN", 04);
 people.put("PURVESH", 25);
 
 //System.out.println(people);
 
 for(String i: people.keySet()) 
 {
	 System.out.println("keys:"  +i+ "values:"+people.get(i));
 }
	}

}
