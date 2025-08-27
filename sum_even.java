import java.util.*;
class sum_even{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int i,sum=0;
		for(i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}	

		}
		System.out.println(sum);	
	}

}