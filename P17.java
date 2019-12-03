import java.lang.*;
import java.util.*;

class P17
{
	public static void main(String args[])
	{
		int number = Integer.parseInt(args[0]);
		int reverse_number = 0;
		int dnumber=number;
		while(dnumber!=0)
		{
			reverse_number=(reverse_number*10)+dnumber%10;
			dnumber=dnumber/10;
		}
		System.out.println(reverse_number);
	}
}
