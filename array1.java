import java.util.*;
class array1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int i;
		for (i=0;i<5;i++) 
		{
			arr[i]=sc.nextInt();	
		}
		for (i=0;i<5;++i) 
		{
			System.out.println(arr[i]);	
		}

	}
}