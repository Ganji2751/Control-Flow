import java.lang.*;
import java.util.*;

class P5
{
	public static void main(String args[])
	{
		char c1 = args[0].charAt(0);
		if(c1>='a' && c1 <='z' || c1>='A' && c1 <='Z')
			System.out.println("Alphabet");
		else if(c1 >= '0' && c1 <='9')
			System.out.println("Digit");
		else
			System.out.println("Special Characters");
	}
}