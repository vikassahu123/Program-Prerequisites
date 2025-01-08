import java.util.*; 
public class Task3 
{ 
  public static void main(String[]args) 
  { Scanner s=new Scanner(System.in); 
    System.out.println("Enter how many celsius you wnat convert");
    double celsius=s.nextDouble(); 
	double fah=(celsius*9/5)+32;
	
	System.out.println(fah); 
	}
} 