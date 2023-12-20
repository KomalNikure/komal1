package classes2;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner myObj=new Scanner(System.in);
System.out.println("Enter Name,Age,Salary");


String name=myObj.nextLine();
int age=myObj.nextInt();
double salary=myObj.nextDouble();


System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Salary:"+salary);
	}

}
