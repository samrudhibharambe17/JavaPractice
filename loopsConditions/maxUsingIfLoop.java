package loopsConditions;

public class maxUsingIfLoop
{
    public static void main(String[] args)
    {
        int a=500;
        int b=100;
        int c=20;

        if(a>=b && a>=c)
        {
            System.out.println(a+ "is largest number");
        }else if(b>=a && a>=c)
        {
            System.out.println(b+ "is largest number");
        }else {
            System.out.println(c+ "is largest number");
        }

    }
}
