package classes2;

import java.util.ArrayList;

public class Lambda_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>numbers=new ArrayList<Integer>();
	
numbers.add(8);
numbers.add(12);
numbers.add(15);
numbers.add(52);
numbers.forEach((n)->{System.out.println(n);});

}
}
