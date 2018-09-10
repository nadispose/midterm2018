package math.problems;

import java.util.ArrayList;
import java.util.List;

public class Pattern
{

	public static void main(String[] args)
	{
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */

		for(int i = 100; i >=0;)
		{
			if(i>90)
			{
				System.out.println(i);
				i--;
			}
			if(i>70 && i<=90)
			{
				System.out.println(i);
				i-=2;
			}
			if(i>40 && i<=70)
			{
				System.out.println(i);
				i-=3;
			}
			if(i<=40)
			{
				System.out.println(i);
				i-=4;
			}
		}
	}
}
