import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class count_no{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        double count=0,rem;
        int nsave=n;
        int x=n;
        double sum=0;
        while(n>0){
            count++;
            n=n/10;
            
        }
        System.out.println("Count : "+count);
        while(x>0)
        {
            rem=x%10;
            sum=sum+(Math.pow(rem,count));
            x=x/10;
        }
        System.out.println("The number is "+sum);

        
    }
}