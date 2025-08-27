import java.util.*;
class stack1{
	Scanner sc=new Scanner(System.in);

	int[] st=new int[6];
	int top=-1;
	void push(){
		System.out.println("Enter the value to be inserted");
		int no=sc.nextInt();
		if(top==st.length-1){
			System.out.println("Stack overflow");
		}
		else
		{
			++top;
			st[top]=no;
		}
	}
	void pop(){
		if(top==-1){
			System.out.println("stack underflow");
		}
		else{
			System.out.println("Deleted value is "+st[top]);
			--top;
		}
	}
	void display(){
		if(top==-1){
			System.out.println("Stack underflow");
		}
		else{
			for(int i=top;i>-1;i--){
				System.out.print(st[i]+" ");
				
			}
		System.out.println();
		}
	}
	void peek(){
		if(top==-1){
			System.out.println("Stack underflow");
		}
		else{
			System.out.println("Topmost value is "+st[top]);
		}
	}
}
class stack{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		stack1 s=new stack1();
		while(true){
			System.out.println("Menu");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("4.Peek");
			System.out.println("5.exit");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice){
			case 1 :
				s.push();
				break;
			case 2 :
				s.pop();
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