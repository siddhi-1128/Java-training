import java.util.*;
class shopping1 {
	int ino,price;
	String iname;
	ArrayList al=new ArrayList();
	Scanner sc=new Scanner(System.in);
	public void inputdata(){
		System.out.println("Enter item number :");
		ino=sc.nextInt();
		al.add(ino);
		System.out.println("Enter item name :");
		iname=sc.next();
		al.add(iname);
		System.out.println("Enter price :");
		price=sc.nextInt();
		al.add(price);
	}
	public void display(){
		System.out.println("Item no\t Item name\t Price");
		System.out.println("----------------------------------");
		for(int i=0;i<ino.size();++i) {
			System.out.println(ino.get(i).toString()+"\t"+iname.get(i)+"\t"+price.get(i).toString());
		}
	}
	public void delete()
	{
		System.out.println("Enter the item number which you want to delete ");
		int n=sc.nextInt();
		for (int i=0;i<ino.size() ;++i ) 
		{
			if(ino.get(i)==n){
				System.out.println("");
			}
		

		}
	}
	public void update(){

	}
	
}
class shopping{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		shopping1 s=new shopping1();
		while(true){
			System.out.println("Menu");
			System.out.println("1.Enter data");
			System.out.println("2.Display data");
			System.out.println("3.Update");
			System.out.println("4.delete");
			System.out.println("5.Exit");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice){
			case 1 :
				s.inputdata();
				break;
			case 2 :
				s.display();
				break;
			case 3 :
				s.update();
				break;
			case 4 :
				s.delete();
				break;
			case 5 :
				System.exit(0);
				break;
			}

		}
	}
}