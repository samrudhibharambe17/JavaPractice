package StarPatternPrint;

import java.util.Scanner;

public class ZeroOneTrianglePrint
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n=Integer.parseInt(sc.nextLine());

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int sum=i+j;
                if(sum%2==0)
                {
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
