import java.util.*;
class facto{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no=sc.nextInt();
		int fact=1,i;
		for(i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);	
	}

}