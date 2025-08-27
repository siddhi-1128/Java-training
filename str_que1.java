import java.util.*;
class str_que1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String a=sc.nextLine();
		System.out.println("Enter the character to be removed :");
		char ch=sc.next().charAt(0);
		String skip="";
		char[] b=a.toCharArray();
		for (int i=0;i<b.length ;i++ ) 
		{
			if(ch==b[i])
			{

				continue;
			}
			else
			{
				
				skip=skip+b[i];
			}
		}
		System.out.println(skip);
	}

}