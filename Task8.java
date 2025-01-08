import java.util.*; 
public class Task8 
{ 
  public static void main(String[]args) 
  { Scanner s=new Scanner(System.in);
  
    System.out.println("Enter base");
    double base =s.nextDouble(); 
	
	System.out.println("Enter exponent");
	double exponent =s.nextDouble(); 
	
	double res=Math.pow(base,exponent); 
	System.out.println("The result is : "+ res); 
	}
}