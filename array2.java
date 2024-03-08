import java.util.*;
class array2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		int i,j,sum=0;
		for (i=0;i<arr.length;++i) 
		{
			for(j=0;j<arr.length;++j)
			{
				arr[i][j]=sc.nextInt();
				sum=sum+arr[i][j];
			}	
		}
		for (i=0;i<arr.length;++i) 
		{
			for (j=0;j<arr.length;++j) {
				System.out.print(arr[i][j]+"\t");	
					
			}
			System.out.println();
		}

		System.out.println(sum);
	}
}7