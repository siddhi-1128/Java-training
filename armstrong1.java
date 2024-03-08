import java.util.*;
class armstrong1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double i,sum=0;
		for(i=1;i<=5;i++)
		{
			double x=i;
			double j=i;
			double count=0;
			while(i>0)
			{
				i=i/10;
				count++;
			}
			System.out.println(count);
			// double m=x%10;
			// sum=sum+(Math.pow(m,count));
			// x=x/10;
			// if(sum==j)
			// {
			// 	System.out.println(j);
			// }
		}
	}

}