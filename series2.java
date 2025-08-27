import java.util.*;
class series2{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x : ");
		int x=sc.nextInt();
		System.out.println("Enter the range : ");
		int n=sc.nextInt();
		double sum=1,i;
		for(i=1;i<=n;i++)
		{
			double no=i;
			double fact=1;
			while(no>0)
			{
				fact=fact*no;
				no--;
			}
			sum=sum+(Math.pow(x,i))/fact;
		}
		System.out.println(sum);	
	}

}