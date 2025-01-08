import java.util.*; 

public class Task6
{

  public static void main(String[]args) 
  { Scanner s=new Scanner(System.in);
  
    System.out.println("Enter principal amount"); 
    double principal=s.nextDouble();
	
	System.out.println("Enter Rate of interest"); 
    double Rate=s.nextDouble();
	
	System.out.println("Enter time (in year) "); 
    double time=s.nextDouble();
	
	
	double si=(principal*Rate*time)/(100);
	
	System.out.println("Simple interest of this is : "+si); 
	}
} 