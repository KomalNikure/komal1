package classes2;

import java.util.HashSet;

public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String>Mobile=new HashSet<String>();
Mobile.add("IPHONE");
Mobile.add("BLACKBERRY");
Mobile.add("SAMSUNG");
Mobile.add("NOKIA");
Mobile.add("IPHONE");

//Mobile.remove("BLACKBERRY");
//Mobile.clear();

//System.out.println(Mobile);

//System.out.println(Mobile.size());


//System.out.println(Mobile.contains("NOKIA"));


//LOOP THROUGH HASHSET

for(String i:Mobile)
{
	System.out.println(i);
}
	}

}
