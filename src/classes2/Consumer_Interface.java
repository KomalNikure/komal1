package classes2;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Consumer_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>numbers=new ArrayList<Integer>();
numbers.add(12);
numbers.add(10);
numbers.add(20);
numbers.add(25);
Consumer<Integer>method=(n)->{System.out.println(n);};
numbers.forEach(method);
	}

}
