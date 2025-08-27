import java.util.*;
class check_strong{
	int no,fact=1,sum=0,rem,x,copy;
	check_strong(int n0){
		no=n0;
	}
	public void check(){
		x=no;
		while(no>0){
			fact=1;
			rem=no%10;
			no=no/10;
			copy=rem;
			while(copy>0)
			{
				fact=fact*copy;
				--copy;
			}
			sum=sum+fact;
		}
		if(x==sum)
		{
			System.out.println(x+" is a strong number");
		}
		else
		{
			System.out.println(x+" is not a strong number");
		}
	}
}


class strong{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number :");
	int n=sc.nextInt();
	check_strong cs=new check_strong(n);
	cs.check();		
		}	
}