import java.util.*;
class area{
	int l,b;
	public area(int a,int c){
		l=a;
		b=c;
	}
	public void returnarea(){
		System.out.println("Area is "+(l*b));
	}
}
class input_area{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth :");
		int len=sc.nextInt();
		int bre=sc.nextInt();
		area a=new area(len,bre);
		a.returnarea();

	}
}