import java.util.*;
abstract class bankaccount{
	String name,city,acc_no;
	int balance;
    void inputdata(String name,String city,String acc_no,int balance){
     	this.name=name;
     	this.city=city;
     	this.acc_no=acc_no;
     	this.balance=balance;
    }
    void display(){
    	System.out.println("Name of the customer "+name);
    	System.out.println("City of the customer "+city);
    	System.out.println("Account number of the customer "+acc_no);
    	System.out.println("Balance is "+balance);
    }
    abstract void deposit(int deposited);
    
    abstract void withdraw(int with);
    	
    
	
}
class savingaccount extends bankaccount{
	int amount;
	void deposit(int deposited){
		amount=deposited;
		balance=balance+amount;
		System.out.println("Balance updated "+balance);
	}
	void withdraw(int amount){
		this.amount=amount;
		balance=balance-amount;
		if((balance-amount)<1000){
			System.out.println("Balance should be 1000.");
		}
		else
		{
			System.out.println("Balance updated "+balance);
		}
	}
	
}
class currentaccount extends bankaccount{
	int depo,with1;
	void deposit(int depo){
		this.depo=depo;
		balance=balance+depo;
		System.out.println("Balance updated"+balance);
	}
	void withdraw(int with1){
		this.with1=with1;
		balance=balance-with1;
		if((balance-with1)<1000){
			System.out.println("Balance should be 1000.");
		}
		else
		{
			System.out.println("Balance updated "+balance);
		}
	}
	
}
class bank{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		savingaccount s=new savingaccount();
		currentaccount c=new currentaccount();
		while(true){
			System.out.println("Menu");
			System.out.println("1.Enter Account details");
			System.out.println("2.Display Account details");
			System.out.println("3.Deposit in saving");
			System.out.println("4.Withdraw from saving");
			System.out.println("5.Deposit in current");
			System.out.println("6.Withdraw from cuurent");
			System.out.println("7.Exit");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the name");
					String name=sc.next();
					// sc.next();
					System.out.println("Enter the city");
					String city=sc.next();
					System.out.println("Enter the acc_no");
					String acc_no=sc.next();
					System.out.println("Enter the balance");
					int balance=sc.nextInt();
					s.inputdata(name,city,acc_no,balance);
					break;
				case 2:
					s.display();
					break;
				case 3:
					System.out.println("Enter the amount to be deposite :");
					int deposited=sc.nextInt();
					s.deposit(deposited);
					break;
				case 4:
					System.out.println("Enter the amount to be Withdraw :");
					int with=sc.nextInt();
					s.withdraw(with);
					break;
				case 5:
					System.out.println("Enter the amount to be deposite :");
					int depo=sc.nextInt();
					c.deposit(depo);
					break;
				case 6:
					System.out.println("Enter the amount to be Withdraw :");
					int with1=sc.nextInt();
					c.withdraw(with1);
					break;
				case 7:
					System.exit(0);
					break;
			}

		}
		

	}
}