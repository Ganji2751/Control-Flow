import java.lang.*;
import java.util.*;

class P13
{
	public static void main(String args[])
	{
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
        	for(int i=number1;i<=number2;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
       			{
        			if(i%j==0)
      			 	{
               				c++;
	        		}
			}	
        		if(c<=2)
        		{
				System.out.print(i+"\t");
        		}
		}
	}
}
