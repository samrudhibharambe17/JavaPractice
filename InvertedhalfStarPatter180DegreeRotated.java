package StarPatternPrint;

import java.util.Scanner;

public class InvertedhalfStarPatter180DegreeRotated
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the values: ");
        int n=Integer.parseInt(sc.nextLine());

        for(int i=1;i<=n;i++)
        {
            for (int j=1; j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
