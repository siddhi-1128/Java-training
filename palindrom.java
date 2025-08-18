import java.util.*;
class palindrom{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int nsave=no;
		int rev=0,rem;
		while(no>0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
		}
		if(rev==nsave){
			System.out.println("palindrom number");
		}	
		else
		{
			System.out.println("not palindrom number");
		}	
	}

}