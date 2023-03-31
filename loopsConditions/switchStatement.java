package loopsConditions;

import java.net.StandardSocketOptions;

public class switchStatement
{
    public static void main(String[] args)
    {
        int a=10;
        switch(65)
        {
            case 10:
                System.out.println("Ten");
                break;
            case 20:
                System.out.println("Twenty");
                break;
            case 'A':
                System.out.println("65");
                break;
            case 10+15+20:
                System.out.println("Con. Expression");
                break;
            default:
                System.out.println("Default");

       }

       System.out.println("End");

    }
}
