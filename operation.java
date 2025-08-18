import java.util.*;
class operation
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=sc.nextLine();
		String str1=sc.nextLine();
		int a=str.length();
		int b=str1.length();
		int count =0;
		if(a>b)
		{
			System.out.println("if a is greater"+(a-b));
		}
		else if(b>a)
		{
			System.out.println("if b is greater "+(b-a));
		} 
		else
		{
			for (int i=0;i<a ;i++) 
			{
				if(str.charAt(i)!=str1.charAt(i))
				{
					count++;
				}
				
			}
		}
			System.out.println("if both are same "+count);
		
	}
}