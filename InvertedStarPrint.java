package StarPatternPrint;

import java.util.Scanner;

public class InvertedStarPrint
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter print star values: ");
        int n=Integer.parseInt(sc.nextLine());

        for (int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
