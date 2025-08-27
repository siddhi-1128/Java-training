import java.util.*;
class stockspan
{
	public static void main(String[] args) 
	{
		int[] mark=new int[]{100,80,60,70,60,75,85};
		int[] res=new int[7];
		res[0]=1;
		int i;
		for ( i=0;i<mark.length;i++) 
		{
			
			for (int j=i+1;j<mark.length ;j++ ) 
			{
				if(mark[i]>mark[j])
				{
					res[j]=1;
				}
				else
				{
					res[j]=2;
				}
			}
		}
		for (i=0;i<res.length;i++ ) 
		{
			res[i]=res[i]*res[i]*res[i];
		}
		
		System.out.println(Arrays.toString(res));
	}
}