import java.util.Scanner;
class grade{
	public static void main(String[] args) {
		double m1,m2,m3,m4,total,per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks :");
		m1=sc.nextDouble();
		m2=sc.nextDouble();
		m3=sc.nextDouble();
		m4=sc.nextDouble();
		total=m1+m2+m3+m4;
		per=total/4.0;
		System.out.println("Total marks : "+total);
		System.out.println("Percentage is "+per);
		if(per>=85)
		{
			System.out.println("Grade A");
		}
		else if(per<85 && per>=75)
		{
			System.out.println("Grade B");
		}
		else if(per<75 && per>=55)
		{
			System.out.println("Grade C");

		}
		else if(per<55 && per>=40)
		{
			System.out.println("Grade D");
		} 
		else
		{
			System.out.println("Grade E");
		}
	}
}