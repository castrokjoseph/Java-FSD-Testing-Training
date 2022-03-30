package day18;

import java.util.Scanner;

public class stackOp
{
	int STACK_SIZE;
    int[] stack;


	public stackOp(int n) 
	{
		this.STACK_SIZE = n;
        this.stack = new int[n];
	}
	 public int push(int top,int ele)
	 {
	        if(top == STACK_SIZE-1)
	        {
	            System.out.println("Stack Overflow.");
	        }else 
	        {
	            top++;
	            stack[top] = ele;
	        }
	        return top;
	 }
	    public int pop(int top)
	    {
	        if (top == -1)
	        {
	            System.out.println("Stack Underflow");
	        }else
	        {
	            System.out.println(String.format("%d removed from the Stack.",stack[top--]));
	        }
	        return top;
	    }
	    public void display(int top)
	    {
	        if (top == -1)
	        {
	            System.out.println("Stack is Empty.");
	        }else
	        {
	            while(top>0)
	            {
	                System.out.print(String.format("%d ",stack[top]));
	                top--;
	            }
	            System.out.print(String.format(" %d",stack[top]));
	        }
	    }
	    public int stackSize(int top)
	    {
	        int count = 0;
	        int temp = top;
	        if (temp == -1)
	        {
	            return count;
	        }else
	        {
	            while (temp>= 0)
	            {
	                ++count;
	                temp--;
	            }
	        }
	        return count;
	    }
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size of the Stack : ");
        int n = sc.nextInt();
        stackOp stack=new stackOp(n);
        int top = -1;
        System.out.println("Enter the Stack elements : ");
        for (int i = 0;i<n;i++)
        {
            int ele = sc.nextInt();
            top = stack.push(top,ele);
        }
        System.out.println("Stack after Inserting the elements : ");
        stack.display(top);
        System.out.println();
        System.out.println("Stack Size after inserting the elements : ");
        System.out.print(stack.stackSize(top));
        System.out.println();
        System.out.println("After applying the pop() operation :");
        top = stack.pop(top);
        System.out.println("Stack after 1st pop() operation performed : ");
        stack.display(top);
        System.out.println();
        System.out.println("Stack Size after 1st pop() : ");
        System.out.print(stack.stackSize(top));
        System.out.println();
	}
	
	}
