import java.util.*;
class series1{
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
			sum=sum+(Math.pow(x,i)/i);
		}
		System.out.println(sum);	
	}

}