import java.util.*;
class str_que2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String a=sc.nextLine();
		System.out.println("Enter the character to be removed :");
		String ch=sc.next();
		System.out.println(a.replace(ch,""));
	}

}