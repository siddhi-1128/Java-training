import java.util.*;
class reverse_string{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String a=sc.nextLine();
		String rev="";
		char[] ch=a.toCharArray();
		for (int i=0;i<ch.length ;i++ ) {
			rev=ch[i]+rev;
		}
		System.out.println(rev);
	
	}
}