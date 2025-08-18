import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class queue1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q0 = new ArrayDeque<Integer>();
        Queue<Integer> q1 = new ArrayDeque<Integer>();
        Queue<Integer> q2 = new ArrayDeque<Integer>();
        System.out.println("Enter value");
        for(int i=0;i<7;i++){
            int n=sc.nextInt();
            q0.add(n);
        } 
        for(int i:q0){
            if(i%2==0){
                q1.add(i);
            }
            else{
                q2.add(i);
            }
        }
        for(int m:q1){
            System.out.println(m);
        }
        for(int o:q2){
            System.out.println(o);
        }
    }
    
}
