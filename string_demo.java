import java.util.*;
class string_demo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		System.out.println(s);
		char ch=s.charAt(4);
		System.out.println(ch);
		String p=s.toUpperCase();
		System.out.println(p);
		String q=s.toLowerCase();
		System.out.println(q);
		int count=s.length();
		System.out.println(count);
		System.out.println(s.indexOf('B'));
		System.out.println(s.lastIndexOf("i"));
		System.out.println(s.indexOf('z'));
		String s1="siddhi bhosale";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.endsWith("ale"));
		System.out.println(s.endsWith("sid"));
		System.out.println(s.startsWith("S"));
		byte s2[]=s.getBytes();
		for (int i=0;i<s2.length;i++) {
			System.out.println((char)s2[i]);
		}
		String a=s.substring(2,7);
		System.out.println(a);
		String d="munmun";
		System.out.println(d.replace('m','g'));
	}
}