import java.util.*;
class mul_without_sign{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for x : ");
		int x=sc.nextInt();
		System.out.println("Enter the value for y : ");
		int y=sc.nextInt();
		int sum=0,i;
		for(i=1;i<=y;i++)
		{
			sum=sum+x;
			
		}
		System.out.println(sum);

	}

}