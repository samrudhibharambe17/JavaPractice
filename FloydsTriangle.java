package StarPatternPrint;

import java.util.Scanner;

public class FloydsTriangle
{
    public static void main(String[] args)
    {
        int num=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Values: ");
        int n=Integer.parseInt(sc.nextLine());

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }
}
