import java.io.*;
import java.util.*;

public class leaders{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] mark=new int[n];
        int[] res=new int[mark.length];
        int i,j,m=0;
        for(i=0;i<mark.length;i++){
            mark[i]=sc.nextInt();
        }
        int max=mark[0];
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