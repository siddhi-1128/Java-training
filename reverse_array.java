import java.util.*;
class reverse_array{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[8];
		int i,temp,j;
		for (i=0;i<8;i++ ) 
		{
			arr[i]=sc.nextInt();
		}
		for (i=0,j=7;i<j;i++,j--) 
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;	
		}
		for (int a:arr) 
		{
			System.out.println(a);
		}
		

	}
}