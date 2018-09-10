package math.problems;

public class MakePyramid {
    public static void main(String[] args)
    {
        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        int n = 15;
        pyramid(15);
    }

    public static void pyramid(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
  }
