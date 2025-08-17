import java.util.*;
class missing{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter element: ");
		for (int i=0;i<n ;i++ ) {
			arr[i]=sc.nextInt();
		}
		// int max=arr[0],temp;
		Arrays.sort(arr);
		// for (int i=0;i<n;i++ ) {
		// 	for (int j=i+1;j<n;j++) {
		// 		if(max>arr[i])
		// 		{
		// 			temp=arr[i];
		// 			arr[i]=arr[j];
		// 			arr[j]=temp;
		// 		}
		// 	}
		// }
		System.out.println(Arrays.toString(arr));
		System.out.println("Missing value is ");
		int miss=0; 
		for (int i=0,j=1;i<n;i++,j++) {
				
				if(arr[i]!=j)
				{
					miss=j;
					break;
				}
				
			
		}
		System.out.println(miss);
	}
}