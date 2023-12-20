package classes2;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>cars=new LinkedList<String>();
		cars.add("THAR");
        cars.add("Audi");
        cars.add("LOMBORGINI");
        cars.add("NEXA");
        
        //System.out.println(cars);
        
      /*  // Use addFirst() to add the item to the beginning
        cars.addFirst("BREZA");
        System.out.println(cars);  */
        
        
    /* // Use addLast() to add the item to the end
        cars.addLast("MERCEDIZE");
        System.out.println(cars);    */
        
        
    /* // Use removeFirst() remove the first item from the list
        cars.removeFirst();
        System.out.println(cars); */
        
        // Use removeLast() remove the last item from the list
        cars.removeLast();
        System.out.println(cars);
        
        // Use getFirst() to display the first item in the list
        System.out.println(cars.getFirst());
        
        // Use getLast() to display the last item in the list
        System.out.println(cars.getLast());
	}

}
