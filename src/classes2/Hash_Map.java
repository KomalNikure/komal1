package classes2;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String>capitalCities=new HashMap<String,String>();
capitalCities.put("MAHARASHTRA","Chandrapur");
capitalCities.put("ANDRAPRADESH","Hyderabad");
capitalCities.put("MADHYAPRADESH","Bhopal");
capitalCities.put("WESTBENGAL","Kolkata");
capitalCities.put("UTARPRADESH","Delhi");



//System.out.println(capitalCities);

//System.out.println(capitalCities.get("MAHARASHTRA"));

/*capitalCities.remove("WESTBENGAL");
System.out.println(capitalCities);  */

//capitalCities.clear();

//System.out.println(capitalCities.size());

/*    //LOOP HASHMAP:keys

     for(String i: capitalCities.keySet())
{
	System.out.println(i);}
	}  */


 /*    //values

	for(String i:capitalCities.values())
	{
		System.out.println(i);
	}     */

//Keys and Values

for(String i: capitalCities.keySet())
	System.out.println("keys:" +i+  "values:" +capitalCities.get(i));
}
}