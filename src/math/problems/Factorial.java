package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial
{
    static int iter(int n)
    {
        int num = 1;
        for(int i = n; i > 1; i--)
        {
            num *= i;
        }
        return num;
    }

    static int recur(int n)
    {
        if (n<=1)
            return 1;
        else
            return(n * recur(n-1));
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        System.out.println(iter(5));
        int num = recur(5);
        System.out.println("recursion: " + num);
    }
}
