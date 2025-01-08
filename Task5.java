import java.util.*; 
public class Task5 
{ 
  public static void main(String[]args) 
  { Scanner s=new Scanner(System.in);
  
    System.out.println("Enter radius"); 
    int radius=s.nextInt();
	
	System.out.println("Enter height"); 
    int height=s.nextInt();
	
	double pi=((22*1.0)/7); 
	double volume=(pi*1.0*radius*radius*height);
	
	System.out.println("volume of cylinder is: "+volume); 
	}
} 