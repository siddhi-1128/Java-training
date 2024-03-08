import java.util.*;
class count_1{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		int count=0;
		if(str.length()==32)
		{
			for(int i=0;i<str.length();i++)
			{	
				if(str.charAt(i)=='1')
				{
					count++;
				}
			}
		}
		else{
			System.out.println("Invalid input");
		}
		System.out.println("no. of 1's is "+count);
	}
}