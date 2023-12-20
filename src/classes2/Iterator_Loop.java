package classes2;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>cities=new ArrayList<String>();
cities.add("MUMBAI");
cities.add("PUNE");
cities.add("HYDERABAD");
cities.add("NAGPUR");

// Get the iterator
Iterator<String>it=cities.iterator();
System.out.println(it.next());

//Loop through a collection
while(it.hasNext())
{
	System.out.println(it.next());
}
	}

}
