import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class link_list {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> ll=new LinkedList<Integer>();
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        System.out.println(ll);
        ll.remove(5);
        System.out.println(ll);
        ll.contains(6);
        System.out.println(ll.contains(6));
        System.out.println(ll.contains(11));
        
    }
}
