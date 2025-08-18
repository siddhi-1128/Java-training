import java.util.*;
class bankaccount{
	String name,city,acc_no;
	int balance,amount;
    void inputdata(String name,String city,String acc_no,int balance){
     	this.name=name;
     	this.city=city;
     	this.acc_no=acc_no;
     	this.balance=balance;
    }
    void display(){
    	System.out.println("Name of the customer"+name);
    	System.out.println("City of the customer"+city);
    	System.out.println("Account number of the customer"+acc_no);
    	System.out.println("Balance is "+balance);
    }
    void deposit(int deposited){
    	amount=deposited;
    	int dep=balance+amount;
    	System.out.println("Balance becomes "+dep);
    }
    void withdraw(int with){
    	amount=with;
    	int wit=balance-amount;
    	
    }
	
}
class savingaccount extends bankaccount{
	void withdraw(int amount){

		if((balance-amount)<1000){
			System.out.println("Balance should be 1000.");
		}
		else
		{
			System.out.println("Balance updated "+(balance-amount));
		}
	}
	
}
class que1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		bankaccount b=new bankaccount();
		savingaccount s=new savingaccount();
		while(true){
			System.out.println("Menu");
			System.out.println("1.Enter Account details");
			System.out.println("2.Display Account details");
			System.out.println("3.Deposit");
			System.out.println("4.Withdraw");
			System.out.println("5.Exit");
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
					System.exit(0);
					break;
			}

		}
		

	}
}