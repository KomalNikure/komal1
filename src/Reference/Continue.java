package Reference;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /* for(int i=0;i<10;i++) 
  {
	  if(i==4) 
	  {
		  continue;
	  }
	  
	  System.out.println(i);
  }*/
		
		int i=0;
		while(i<10) 
		{
			if(i==4) 
			{
				i++;
				continue;
				
			}
			
			System.out.println(i);
			i++;
		}
	}

}
