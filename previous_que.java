import java.util.*;
class previous_que
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the semester");
		int n=sc.nextInt();
		int max;
		for (int i=0;i<n;i++)
		{

			System.out.println("Enter the no. of subjects in sem:" +(i+1));
			int sub=sc.nextInt();
			// int max[]=new int[sub];
			int[] marks=new int[sub];
			System.out.println("Marks obtained in sem "+(i+1));
			for (int j=0;j<sub;j++) 
			{
				marks[j]=sc.nextInt();
			}
			System.out.println(Arrays.toString(marks));
			max=marks[0];
			for (int k=0;k<marks.length ;k++ ) {
				if(max<marks[k])
				{
					max=marks[k];	
				}
			}
			System.out.println("Maximum marks is "+max);
		}
	}
}