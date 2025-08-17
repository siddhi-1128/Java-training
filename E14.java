import java.util.*;
class E14{
	public static void main(String args[])
	{
		int p1,p2,p3;
		String gender;
		Scanner sc= new Scanner(System.in);
		p1=sc.nextInt();
		p2=sc.nextInt();
		p3=sc.nextInt();
		System.out.println("Enter gender(f/m): ");
		gender=sc.next();
		int total=p1+p2+p3;
		System.out.println(total);
		int per=total/3;
		System.out.println(per);
 		if(per>=62 && gender.equals("f")){
 			System.out.println("Admitted in course");
 		}
 		else if(per>=62 && gender.equals("m")){
 			System.out.println("Admitted in course");
 		}
 		else{
 			System.out.println("Admission failure");	
 		}
	}
}