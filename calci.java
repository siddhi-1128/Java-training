import java.util.*;
class calci{
	public static void main(String[] args) 

	{
		while (true) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two no. :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Division");
		System.out.println("4.Multiplication");
		System.out.println("5.Exit");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Addition is "+(a+b));
				break;
			case 2:
				System.out.println("Subtraction is "+(a-b));
				break;
			case 3:
				System.out.println("Division is "+(a/b));
				break;
			case 4:
				System.out.println("Multiplication is "+(a*b));
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input");
				break;
		
		}

		}
		
	}

}