import java.lang.*;
import java.util.*;

class P15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum=0,remainder=0;
		sc.close();
		for(int i=0;number!=0;i++)
		{
			remainder=number%10;
			sum=sum+remainder;
			number=number/10;
		}	
		System.out.println(sum);
	}
}
