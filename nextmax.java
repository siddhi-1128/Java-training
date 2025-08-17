import java.util.*;
class nextmax{
	public static void main(String[] args) {
		int[] mark=new int[]{1,3,2,4};
		int[] res=new int[4];
		int max;
		for (int i=0;i<mark.length;i++) 
		{
			max=mark[i];
			for (int j=i+1;j<mark.length ;j++ ) 
			{
				if(max<mark[j])
				{
					res[i]=mark[j];
					break;
				}
				res[3]=-1;
			}
			
		}
		System.out.println(Arrays.toString(res));
	}
}