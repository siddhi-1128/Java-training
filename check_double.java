import java.util.*;
class check_double{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for (int i=0;i<n ;i++ ) {
			System.out.println("Enter elements :");
			a[i]=sc.nextInt();
		}
		int count=0;
		int flag=0;
		for (int i=0;i<n ;i++ ) {
			count=0;
			for(int j=i+1;j<n;j++)
			{
				
				if(a[i]==a[j])
				{
					count++;
				}
				if(count>=2)
				{
					count=count;
				}
			}
			
		}
		if(count>=2)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}