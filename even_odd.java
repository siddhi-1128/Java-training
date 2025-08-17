import java.util.*;
class even_odd{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int even=0,i,odd=0;
		for(i=1;i<=500;i++)
		{
			if(i%2==0)
			{
				even++;
			}
			else	
			{
				odd++;
			}		
		}
		System.out.println(even);
		System.out.println(odd);

	}

}