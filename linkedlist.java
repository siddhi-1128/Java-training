import java.util.*;
class linkedkistDemo{
	Scanner sc=new Scanner(System.in);
	class getnode{
		int data;
		getnode next;
		public getnode(){
			next=null;
		}
	}
	getnode head=null;
	public void append(){
		System.out.println("Enter the data");
		int data=sc.nextInt();
		getnode newnode=new getnode();
			newnode.data=data;
		if(newnode==null){
			System.out.println("Memory not available");
		}
		else if(head==null){
			head=newnode;
		}
		else{
			getnode ptr=head;
			while(ptr.next!=null){
				ptr=ptr.next;
			}
			ptr.next=newnode;

		}
	}
	public void display()
	{
		getnode ptr=new getnode();
		ptr=head;
		if(head==null){
			System.out.println("linked list is empty");
		}
		else{
			while(ptr!=null)
			{
				int temp=ptr.data;
				System.out.print(temp+" ");
				ptr=ptr.next;
			}
			System.out.println();
		}
	}
	public void append_start(){
		getnode newnode=new getnode();
		System.out.println("Enter the value to be inserted");
		int val=sc.nextInt();
		newnode.data=val;
		if(head==null){
			head=newnode;
		}
		else{
			newnode.next=head;
			head=newnode;
		}
	}
	public void append_at_end()
	{
		getnode newnode=new getnode();
		System.out.println("Enter the value to be inserted");
		int data=sc.nextInt();
		System.out.println("Enter the data after which node inserted");
		int val=sc.nextInt();
		newnode.data=data;
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			getnode ptr;
			getnode preptr;
			// ptr=head;
			preptr=head;
			while(preptr.data!=data)
			{
				ptr=preptr.next;
				newnode.next=ptr.next;	

			}
			
		}
	}
	public void delete_start(){
		getnode ptr,ptr1;
		ptr=head;
		ptr1=ptr.next;
		ptr.next=null;
		head=ptr1;
		System.out.println("Deleted data :"+ptr.data);
	}
	public void delete_after(){
		System.out.println("Enter data after node will be deleted ");
		int key=sc.nextInt();
		getnode ptr;
		ptr=head;

		if(head==null)
		{
			System.out.println("Linked list empty");
		}
		else 
		{
			while(ptr.next!=null)
			{
				if(ptr.data==key)
				{
					break;
				}
				else {
					ptr=ptr.next;
				}
			}
			if(ptr.next==null)
			{
				System.out.println("Data not found");
			}
			else
			{
				getnode ptr1,ptr2;
				ptr1=ptr.next;
				ptr2=ptr1.next;
				ptr1=ptr.next;
				ptr2=ptr1.next;
				ptr.next=ptr2;
				System.out.println("Deleted data :"+ptr1.data);
			}
		}
	}
}

class linkedlist
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		linkedkistDemo l=new linkedkistDemo();
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.Append");
			System.out.println("2.Display");
			System.out.println("3.Append at beginning");
			System.out.println("4.Delete after");
			System.out.println("5.Delete start");
			System.out.println("6.Exit");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1 :
					l.append();
					break;
				case 2 :
					l.display();
					break;
				case 3 :
					l.append_start();
					break;
				case 4:
					l.delete_after();
					break;
				case 5 :
					l.delete_start();
					break;
				case 6 :
					System.exit(0);
					break;
			}
		}
	}
}