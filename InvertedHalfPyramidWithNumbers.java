package StarPatternPrint;

import java.util.Scanner;

public class InvertedHalfPyramidWithNumbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter values: ");
        int n=Integer.parseInt(sc.nextLine());

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
