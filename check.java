import java.util.*;
class check{
	public static void main(String[] args) 

	{
		Scanner sc= new Scanner(System.in);
		char ch;
		System.out.println("Enter the character");
		ch=sc.next().charAt(0);
		if(ch>=65 && ch<=90)
		{
			System.out.println("Character is in uppercase");
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println("Character is in lowercase");
		} 
		else if(ch>=48 && ch<=57)
		{
			System.out.println("Character is a number");
		}
		else
		{
			System.out.println("Character is a special symbol");
		}
	}
}