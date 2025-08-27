import java.util.*;
class reverse
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int digit;
		System.out.println("Enter the no. :");
		digit=sc.nextInt();
		int n4=digit%10;
		digit=digit/10;
		int n3=digit%10;
		digit=digit/10;
		int n2=digit%10;
		digit=digit/10;
		int n1=digit%10;
		digit=digit/10;
		int res=n4*1000+n3*100+n2*10+n1*1;
		System.out.println(res);
	}
}