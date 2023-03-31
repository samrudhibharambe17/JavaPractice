package loopsConditions;
public class maxUsingNestedLoop
{
    public static void main(String[] args)
        {
            //initializing numbers to compare
            int x = 1010;
            int y = 170;
            int z = 169;
            if(x >= y)
            {
                if(x >= z)
                    //prints x, if the above two conditions are true
                    System.out.println("The largest number is: "+x);
                else
              //prints z, if the condition defined in inner if is true and the condition defined in inner if is false
              //means x>y and x<z
                    System.out.println("The largest number is: "+z);
            }
            else
            {
                if(y >= z)
                //prints y, if the condition defined in outer if is false and the condition defined in inner if is true
                //means z>x and y>z
                    System.out.println("The largest number is: "+y);
                else
                //prints z, if the condition defined in both inner and outer loop is false
                //z>x and z>y
                    System.out.println("The largest number is: "+z);
            }
        }
    }