import java.util.*;
class any_arm{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		double count=0,rem=0,sum=0;
		int nsave=n;
		int x=n;
		while(n>0){
			n=n/10;
			count++;
		}
		System.out.println(count);
		while(x>0)
		{
			rem=x%10;
			sum=sum+Math.pow(rem,count);
			x=x/10;
		}
		System.out.println(sum);
		if(nsave==sum)
		{
			System.out.println(nsave+" is an armstrong number");
		}
		else
		{
			System.out.println(nsave+" is not an armstrong number");
		}
	}
}