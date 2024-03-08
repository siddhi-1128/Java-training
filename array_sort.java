import java.io.*;
import java.util.*;
class sort{
    
    int size,temp;
    int[] arr=new int[size];
    sort(int s,int[] a)
    {
        size=s;
        arr[size]=a[s];
    }
    void sort012()
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class array_sort {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int s=sc.nextInt();
        int[] a=new int[s];
        for(int k=0;k<a.length;k++)
        {
            a[k]=sc.nextInt();
        }
        sort st=new sort(s,a);
        st.sort012();
    }
}