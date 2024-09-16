import java.util.*;
class E13{
	public static void main(String args[])
	{
		int p1,p2,p3;
		
		Scanner sc= new Scanner(System.in);
		p1=sc.nextInt();
		p2=sc.nextInt();
		p3=sc.nextInt();
		if(p1<45 || p2<45 || p3<45){
			System.out.println("Fail");
		}
		else{
			System.out.println("Pass");
		}
	}
}