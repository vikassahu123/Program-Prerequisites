import java.util.*; 
public class Task4 
{ 
  public static void main(String[]args) 
  { Scanner s=new Scanner(System.in);
  
    System.out.println("Enter radius"); 
    int radius=s.nextInt();
	
	double pi=((22*1.0)/7); 
	double area=(pi*1.0*radius*radius);
	
	System.out.println("Area of circle is: "+area); 
	}
} 