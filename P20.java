import java.lang.*;
import java.util.*;

class P20
{
	public static void main(String args[])
	{
		String c;
		do
		{
			System.out.println("-----------Menu----------\n1.Add\n2.Sub");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter first number");
				int a = sc.nextInt();
				System.out.println("Enter second number");
				int b = sc.nextInt();
				int add = a + b;
				System.out.println("After addition:"+add);
			}
			else if(choice ==2)
			{
				System.out.println("Enter first number");
				int a = sc.nextInt();
				System.out.println("Enter second number");
				int b = sc.nextInt();
				int sub = a - b;
				System.out.println("After subtraction:"+sub);
			}
			else
			{
				System.out.println("Enter Valid Choice Between 1 and 2");
			}
			System.out.println("Enter y or Y to continue");
			c = sc.next();
		}while(c.equals("Y")||c.equals("y"));
	}
}
