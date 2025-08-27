import java.util.*;
class small_large{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int i;

		for (i=0;i<5;i++) 
		{
			arr[i]=sc.nextInt();	
		}
		int small=arr[0];
		int large=arr[0];
		for (i=0;i<5;++i) 
		{
			if(small>arr[i])
			{
				small=arr[i];
			}
			if(large<arr[i])
			{
				large=arr[i];
			}
		}
		System.out.println("Small :"+small+", Large :"+large);
	}
}