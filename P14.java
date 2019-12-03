import java.lang.*;
import java.util.*;

class P14
{
	public static void main(String args[])
	{
		if(args.length!=0)
		{
			int number = Integer.parseInt(args[0]);
			int flag=0;
       			int c=0;
			if(number==1||number==0)
			{
				System.out.println(number+" is neither prime nor composite");
			}
        		else
			{
				for(int j=1;j<=number;j++)
      				{	
        				if(number%j==0)
      				 	{
               					c++;
	        			}
				}
				if(c<=2)
        			{
					flag = 1;
        			}
				if(flag==1)
					System.out.println("it is a prime number");
				else
					System.out.println("it is not a prime number");
			}
		}
		else
		{
			System.out.println("Please enter an integer number");
		}	
	}
}
