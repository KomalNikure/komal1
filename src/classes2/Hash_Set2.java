package classes2;

import java.util.HashSet;

public class Hash_Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer>numbers=new HashSet<>();
numbers.add(19);
numbers.add(27);
numbers.add(56);
numbers.add(90);
numbers.add(75);

//System.out.println(numbers);
	
	for(int i=0;i<=100;i++)
	{
		if(numbers.contains(i)) 
		{
			System.out.println(i + "found in a set");
		}
		else
		{
			System.out.println(i + "not found in a set");
		}
	}
	}

}
