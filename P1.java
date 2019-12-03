import java.lang.*;
import java.util.*;

class P1
{
	public static void main(String number[])
	{
		int a = Integer.parseInt(number[0]);
		if(a < 0)
			System.out.println("The Given Number is Negative");
		else if(a == 0)
			System.out.println("The Given Number is Zero");
		else
			System.out.println("The Given Number is Positive");
	}
}