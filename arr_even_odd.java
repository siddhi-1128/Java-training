import java.util.*;
class arr_even_odd{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int i,even=0,odd=0;
		for (i=0;i<5;i++) 
		{
			arr[i]=sc.nextInt();	
		}
		for (i=0;i<5;++i) 
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else	
			{
				odd++;
			}
		}
		System.out.println("even"+even+"odd"+odd);
	}
}