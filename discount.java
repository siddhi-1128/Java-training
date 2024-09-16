import java.util.*;
class discount
{
	public static void main(String[] args) 
	{
		int cost_price;

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter cost price");
		cost_price=sc.nextInt();
		System.out.println("cost price is "+cost_price);
		System.out.println("Are you student (y/n) :");
		char ch=sc.next().charAt(0);
		if(ch=='y')
		{
			if(cost_price>500)
			{
				System.out.println("Discount 10%");
				System.out.println("New price :"+(cost_price-(cost_price*0.1)));
			}
			else
			{
				System.out.println("discount 5%");
				System.out.println("New price : "+(cost_price-(cost_price/0.05)));
			}
		}
		else
		{
			if(cost_price>500)
			{
				System.out.println("Discount 8%");
				System.out.println("New price : "+(cost_price-(cost_price/0.08)));
			}
			else
			{
				System.out.println("Discount 2%");
				System.out.println("New price : "+(cost_price-(cost_price/0.02)));
			}
		}
	}
}