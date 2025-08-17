import java.util.*;
class leader{
	public static void main(String[] args) {
		int[] mark=new int[]{16,17,4,3,5,2};
		int[] res=new int[mark.length];
		int max=mark[0];
		int i,j,m=0;
		for (i=0;i<mark.length;i++) 
		{ 
			max=mark[i];
			for (j=i+1;j<mark.length ;j++ ) 
			{
				if(max<mark[j])
				{
					max=mark[j];
					res[m]=max;
					i=j;
					m++;
					break;
				}
			
			}
					
		}
		res[m]=max;
		// System.out.println(Arrays.toString(res));
		for(i=0;i<=m;i++){
			System.out.print(res[i]+" ");
		}
		

	}
}