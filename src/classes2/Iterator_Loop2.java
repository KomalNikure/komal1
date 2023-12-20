package classes2;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>numbers=new ArrayList<Integer>();
numbers.add(25);
numbers.add(12);
numbers.add(10);
numbers.add(06);

Iterator<Integer>it=numbers.iterator();
while(it.hasNext())
{
	Integer i=it.next();
	if(i<10
			)
	{
		it.remove();
	}
} 
System.out.println(numbers);
	}

}
