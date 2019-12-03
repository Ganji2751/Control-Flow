import java.lang.*;
import java.util.*;

class P16
{
	public static void main(String args[])
	{
		if(args.length!=0)
		{
			int number = Integer.parseInt(args[0]);
			for(int i=0;i<number;i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print("* ");	
				}
				System.out.println("\n");
			}
		}
		else
		{
			System.out.println("please enter an integer number");
		}
	}
}
