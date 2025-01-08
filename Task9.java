import java.util.*; 
public class Task9 
{ 
  public static void main(String[]args) 
  { Scanner s=new Scanner(System.in);
  
    System.out.println("Enter first number");
    int a=s.nextInt(); 
	
	System.out.println("Enter second number");
	int b=s.nextInt(); 
	
	System.out.println("Enter third number");
	int c=s.nextInt();
	
	double avg=(a+b+c)/(1.0*3);
	System.out.println("The average of three numbers is: "+ avg); 
	}
} 