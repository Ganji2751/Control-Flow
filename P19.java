import java.lang.*;
import java.util.*;

class P19
{
	public static void main(String args[])
	{
		int count=5;
		int number = 5;
		while(count!=0)
		{
			if((number%2==0)&&(number%3==0)&&(number%5==0))
			{
				System.out.print(number+" ");
				count--;
			}
			number++;
		}
	}
}
