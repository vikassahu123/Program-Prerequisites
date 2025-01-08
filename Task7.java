import java.util.*; 
public class Task7 
{ 
  public static void main(String[]args) 
  { Scanner s=new Scanner(System.in);
  
    System.out.println("Enter length");
    double length =s.nextDouble(); 
	
	System.out.println("Enter width");
	double width =s.nextDouble(); 
	
	double perimeter=2*(length+width); 
	System.out.println("The perimeter of a rectangle: "+ perimeter); 
	}
}