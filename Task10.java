import java.util.*; 
public class Task10 
{ 
  public static void main(String[]args) 
  { Scanner s=new Scanner(System.in);
  
    System.out.println("Enter distance in kilometers");
    int kilometer=s.nextInt(); 
	
	double miles=kilometer*0.621371;
	System.out.println("The distance is in miles : "+ miles); 
	}
} 