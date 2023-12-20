package classes2;



public class Encapsulation {

	  public static void main(String[] args) 
	  {
	    Encapsulation myObj = new Encapsulation();
	    myObj.setName("John");
	    System.out.println(myObj.getName());
	  }
	

	 
private String name;

	   // Getter
	   public String getName() 
	   {
	     return name;
	   }

	   // Setter
	   public void setName(String newName) 
	   {
	     this.name = newName;
	   }
	}
