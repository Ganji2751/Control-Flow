import java.lang.*;
import java.util.*;

class P7
{
	public static void main(String args[])
	{
		char c1 = args[0].charAt(0);
		if(c1>='a' && c1 <='z')
			System.out.println(Character.toUpperCase(c1));
		else if(c1>='a' && c1 <='z' || c1>='A' && c1 <='Z')
			System.out.println(Character.toLowerCase(c1));
		else
			System.out.println("Special Characters");
	}
}