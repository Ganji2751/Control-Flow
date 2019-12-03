import java.lang.*;
import java.util.*;

class P3
{
	public static void main(String args[])
	{
		int length=args.length;
		if(length!=0)
		{
			for(int i=0;i<length;i++)
			{
				if(i!=length-1)
					System.out.print(args[i]+",");
				else
					System.out.print(args[i]);
			}
		}
		else
			System.out.println("No Values");
	}
}