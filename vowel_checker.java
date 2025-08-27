import java.util.*;
class vowel_checker
{
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the letter in lowercase :");
		char letter=sc.next().charAt(0);
		
 		if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u')
 		{
 			System.out.println("Vowel");
 		}
 		else
 		{
 			System.out.println("Consonent");	
 		}
	}
}