import java.util.*;
class factorial{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		int fact=1;
		while(no>0)
		{
			fact=fact*no;
			no--;
		}
		System.out.println(fact);	
	}

}