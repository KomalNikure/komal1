package classes;

public class ConstPara {
int ModelYear;
String ModelName;

public ConstPara(int year,String name) 
{
	ModelYear=year;
	ModelName=name;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ConstPara myCar=new ConstPara(2023,"tvs");
 System.out.println(myCar.ModelYear+""+myCar.ModelName);
	}

}
