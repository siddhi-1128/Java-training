import java.util.*;
class sum{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int count=0;
		int sum=0;
		while(no>0)
		{
			int n=no%10;
			no=no/10;
			sum=sum+n;
			count++;
		}
		System.out.println(sum);	
	}

}