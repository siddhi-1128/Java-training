import java.util.*;
class E15
{
	public static void main(String args[])
	{
		String day;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the day (sun,mon,tue,etc.) :");
		day=sc.next();
		
 		if(day.equals("sun") || day.equals("sat"))
 		{
 			System.out.println("Weekend days");
 		}
 		else
 		{
 			System.out.println("working days");	
 		}
	}
}