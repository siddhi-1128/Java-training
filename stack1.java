import java.util.Scanner;
import java.util.Stack;
class stack1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<Integer>();
        int m=0;
        int sum=0;
        for(int i=0;i<5;i++){
            System.out.println("Enter :");
            m=sc.nextInt();
            sum+=m;
            st.push(m);



        }
        System.out.println(st);

        int avg=sum/5; 
        st.push(avg);
        for(int n:st){
            System.out.println(n);
        }
      
    }
} 