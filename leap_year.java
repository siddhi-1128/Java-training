

class leap_year{
	public static void main(String args[])
	{
		// fully classified class
		java.util.Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		if(year%100!=0)
		{
			if(year%4==0)
			{
				System.out.println("Non-century leap year ");
			}
			else
			{
				System.out.println("Not a leap year");
			}
		}
		else
		{
			if(year%400==0)
			{
				System.out.println("Century leap year");
			}
			else
			{
				System.out.println("Not a leap year");
			}
		}
	}
}