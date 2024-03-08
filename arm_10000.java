import java.util.*;
class arm_10000{
	public static void main(String[] args) {
		int i;
		for (i=1;i<=10000;++i) 
		{
			int n=i,x=i;
			double count=0,sum=0,rem=0;
			while(x>0)	
			{
				x=x/10;
				++count;
			}
			while(n>0)
			{
				rem=n%10;
				sum=sum+Math.pow(rem,count);
				n=n/10;
			}
			if(i==sum)
			{
				System.out.println(i+" is an armstrong number");
				
			}
			
		}
	}
}