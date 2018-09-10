package math.problems;

public class Fibonacci {

    static boolean fibbonacci(int n)
    {
        int num1=0, num2=1, total=0;
        for (int i = 0; i < n; i++)
        {
            total=num1+num2;
            System.out.println(total);
            num1=num2;
            num2=total;
        }
        return true;
    }
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
         fibbonacci(40);
    }
}
