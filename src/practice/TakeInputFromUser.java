package practice;

import java.util.Scanner;

public class TakeInputFromUser {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("what is your name?");
	String name=sc.nextLine();
	System.out.println("hello" +   name);
	
	System.out.println("what is your city ?");
	String city=sc.nextLine();
	System.out.println("your city name is"+city);
	
	
	System.out.println("what is your age");
	int age=sc.nextInt();
	System.out.println("your age is" +age);
	
	
	sc.close();
}
}
