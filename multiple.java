import java.util.*;
class multiple{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int count=0;
		int mul=1;
		while(no>0)
		{
			int n=no%10;
			no=no/10;
			mul=mul*n;
			count++;
		}
		System.out.println(mul);	
	}

}