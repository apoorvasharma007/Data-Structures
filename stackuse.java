import java.util.Scanner;
class stackuse
{
    public static void main(String[] args) 
    {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter stack size");
		int size=scan.nextInt();
		Stack s = new Stack(size);
		while(1>0)
		{
			System.out.println("choice 1:push, 2:pop, 3:peek, 4:top, 5:size");
			int choice=scan.nextInt();
			if(choice==1)
			{
				System.out.println("Enter number to be pushed");
				s.push(scan.nextInt());
			}
			else if(choice==2)
			{   int returned=s.pop();
				if(returned != -1)
					System.out.println("Popped "+returned);
				else
					System.out.println("Stack is empty");
			}
			else if(choice==3)
			{
				s.peek();
			}
			else if(choice==4)
				s.top();
			else
				System.out.println("stack size currently is "+ s.size()); // if 5 or anything else is entered, else will be executed.

		}
		
		

	}
}