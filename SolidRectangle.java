package StarPatternPrint;

import java.util.Scanner;

public class SolidRectangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        int n= Integer.parseInt(sc.nextLine());
        int m= Integer.parseInt(sc.nextLine());

       // int n=4;
       // int m=5;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
