import java.util.*;
class armstrong{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int nsave=no;
		int sum=0;
		while(no>0)
		{
			int n=no%10;
			sum=sum+(n*n*n);
			no=no/10;
			
		}
		if(sum==nsave){
			System.out.println("Armstrong number");
		}	
		else
		{
			System.out.println("not armstrong number");
		}	
	}

}