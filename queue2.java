import java.util.*;
class queue1{
	Scanner sc=new Scanner(System.in);

	int[] q=new int[6];
	int rear=-1,front=-1;
	void insert(){
		int no;
		if(rear==q.length-1){
			System.out.println("queue is full");
		}
		else if(rear==-1 && front==-1)
		{
			System.out.println("Enter the value to be inserted");
			no=sc.nextInt();
			front=rear=0;
			q[rear]=no;
		}
		else{
			System.out.println("Enter the value to be inserted");
			no=sc.nextInt();
			++rear;
			q[rear]=no;
		}
	}
	void delete(){
		if(front==-1){
			System.out.println("queue is empty");
		}
		else{
			System.out.println("Deleted value is "+q[front]);
			
			for (int i=0;i<rear;i++ ) {
				q[i]=q[i+1];
			}
			--rear;
		}
	}
	void display(){
		if(front==-1){
			System.out.println("queue is empty");
		}
		else{
			for(int i=front;i<=rear;i++){
				System.out.print(q[i]+" ");
				
			}
		System.out.println();
		}
	}
	void peek(){
		if(front==-1){
			System.out.println("queue is empty");
		}
		else{
			System.out.println("Last value is "+q[rear]);
		}
	}
}
class queue2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		queue1 s=new queue1();
		while(true){
			System.out.println("Menu");
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Display");
			System.out.println("4.Peek");
			System.out.println("5.exit");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice){
			case 1 :
				s.insert();
				break;
			case 2 :
				s.delete();
				break;
			case 3 :
				s.display();
				break;
			case 4 :
				s.peek();
				break;
			case 5 :
				System.exit(0);
				break;
			}
		}
	}
}