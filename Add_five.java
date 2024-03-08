import java.util.*;
class Add_five
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int digit;
		System.out.println("Enter the no. :");
		digit=sc.nextInt();
		int n3=digit%10;
		int n2=digit/10000;
		int res=n3+n2;
		System.out.println(res);
	}
}