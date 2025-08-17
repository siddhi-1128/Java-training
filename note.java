import java.util.*;
class note{
	public static void main(String[] args) 

	{
		while (true) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter amount :");
		int amount=sc.nextInt();
		System.out.println("Choice range");
		System.out.println("2000");
		System.out.println("500");
		System.out.println("200");
		System.out.println("100");
		System.out.println("50");
		System.out.println("20");
		System.out.println("10");
		System.out.println("5");
		System.out.println("2");
		System.out.println("1");
		System.out.println("Enter notes");
		int note=sc.nextInt();
		switch(note)
		{
			case 2000:
				int n1=amount/2000;
				System.out.println("2000 * "+(amount/2000)+ "=" +(2000*n1));
				amount=amount%2000;
			case 500:
				int n2=amount/500;
				System.out.println("500 * "+(amount/500)+ "=" +(500*n2));
				amount=amount%500;
			case 200:
				int n3=amount/200;
				System.out.println("200 * "+(amount/200)+ "=" +(200*n3));
				amount=amount%200;
			case 100:
				int n4=amount/100;
				System.out.println("100 * "+(amount/100)+ "=" +(100*n4));
				amount=amount%100;
			case 50:
				int n5=amount/50;
				System.out.println("50 * "+(amount/50)+ "=" +(50*n5));
				amount=amount%50;
			case 20:
				int n6=amount/20;
				System.out.println("20 * "+(amount/20)+ "=" +(20*n6));
				amount=amount%20;
			case 10:
				int n7=amount/10;
				System.out.println("10 * "+(amount/10)+ "=" +(10*n7));
				amount=amount%10;
			case 5:
				int n8=amount/5;
				System.out.println("5 * "+(amount/5)+ "=" +(5*n8));
				amount=amount%5;
			case 2:
				int n9=amount/2;
				System.out.println("2 * "+(amount/2)+ "=" +(2*n9));
				amount=amount%2;
			case 1:
				int n10=amount/1;
				System.out.println("1 * "+(amount/1)+ "=" +(1*n10));
				amount=amount%1;
		}

		}
		
	}

}