package loopsConditions;

public class right1SideStarTrianglePattern
{
    public static void main(String[] args)
    {
        int size=6; //size of triangle

        for(int i=0;i<size;i++) //loop to print the pattern
        {
            for(int j=1;j<size-i;j++) //print space
            {
                System.out.print(" ");
            }

            for(int star=0;star<=i;star++) //print star
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
