// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Stack {
    int top,size;
    int[] array;
    Stack()
    {
        size=4;
        top=-1;
        array = new int[size];
    }
    void push(int x)
    {
        if(top==size-1)
            System.out.println("Stack overflow");
        else
	{
            top++;
            array[top]=x;
        }
    }
    void pop()
    {
        if(top==-1)
            System.out.println("stack underflow");
        else
	{
            System.out.println("the deleted element is "+array[top]);
            top--;
        }
    }
    void display()
    {
        if(top==-1)
            System.out.println("stack underflow");
        else
	{
            for(int i=top;i>=0;i--)
                System.out.println(array[i]);
        }
    }
}
class main01
{
    public static void main(String[] args)
    
    {
        Stack st=new Stack();
        Scanner sc=new Scanner(System.in);
	int s;
        do
        {
            System.out.println("Main Menu");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
	    System.out.println("4.Exit");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
          
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the number to be inserted");
                    int x=sc.nextInt();
                    st.push(x);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.display();
                    break;
		case 4:
		    System.out.println("Thank you for using the app");
		    System.exit(0);
            }
            System.out.println("Do you want to go again in main menu(1/0) 1 for yes and 0 for no ");
         s=sc.nextInt();  
        }while(s!=0);
    }
}