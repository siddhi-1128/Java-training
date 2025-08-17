import java.util.*;
class fibonacci{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int f0=0,f1=1,f2,i;
		System.out.println("Enter range");
		int range=sc.nextInt();
		System.out.print(f0);
		System.out.print(f1);
		for(i=3;i<=range;i++)
		{
			f2=f0+f1;
			System.out.print(f2);
			f0=f1;
			f1=f2;
		}
		
	}

}