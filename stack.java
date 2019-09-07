

public class Stack 
{
	public int top=-1; //my top will point to the top value of stack, initially there is nothing on stack so it points to no one.
	public int stacksize;
	public int[] stackarray;

	public Stack(int stacksize)
	{
		this.stacksize=stacksize; // I will need stack size in push pop functions.
		stackarray=new int[stacksize]; //make an array of required size for our stack.
	}

	public void push(int number)
	{
		if(top<stacksize-1)    // indexes for stackarray will be from 0 to stacksize-1, so top will go upto stacksize-1.
		{	
			top++;
			stackarray[top]=number;
	    }
	    else
	    	System.out.println("Stack is full");
	}
	public int pop()
	{   
		if(top>-1) 
		{	
			int temp=stackarray[top]; 
			stackarray[top]=0; // set the deleted value to zero.
			top--;
			return temp;
		}
		else
		{
			return -1;
		}
	}
	public void peek() // will show the the values on the stack 
	{   
		if(top>-1)
		{	
			for(int i=0;i<=top;i++)
			{
				System.out.print(stackarray[i]+" ");
			}
			System.out.println("");// just to add new line
		} 
	}
	public void top() // returns top and the value on the top
	{   
		if(top>-1)
		System.out.println("top="+top+" and value="+stackarray[top]);
		else
			System.out.println("stack empty so top is "+ top);
	}
	public int size()
	{
		return top+1; // number of elements on stack
	}
}