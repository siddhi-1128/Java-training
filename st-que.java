import java.util.*;
class st_que
{
  public static void main(String[] args )
  {
    Stack<Integer> st1=new Stack<Integer>();
    Stack<Integer> st2=new Stack<Integer>();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no of elements");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      int ch=sc.nextInt();
      st1.push(ch);
      System.out.println(st1);
    }
  }
}
