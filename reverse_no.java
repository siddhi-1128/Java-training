import java.util.*;
class reverse_no
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int rev=0,rem;
		if(n>0)
		{
			while(n>0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
		}
		else
		{
			while(n<0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
		}
		System.out.println("Reverse number is "+rev);
	}
}