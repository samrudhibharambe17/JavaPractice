package loopsConditions;

import java.util.Scanner;

public class mathExample
{
    //
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter x value: ");
         double x=sc.nextDouble();
         System.out.print("Enter y value: ");
         double y=sc.nextDouble();
         System.out.print("Enter z value: ");
         double z=sc.nextDouble();


         double result =Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z)); //16+25=41-6=35
         System.out.println("Final Result: "+result);



       /*double num1,num2,num3;
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter a number of x:");
       num1=sc.nextDouble();
        System.out.println("Enter a number of y:");
       num2=sc.nextDouble();
        System.out.println("Enter a number of z:");
        num3=sc.nextDouble();

       double x=Math.pow(num1,2);
       System.out.println("Sqaure of x =" +x);

       double y=Math.pow(num2,2);
       System.out.println("Sqaure of y =" +y);

       double z=Math.abs(num3);
       System.out.println("Absoulte value of z =" +z);

        System.out.println("x^2+y^2-|z| =" +((x+y)-z));

        System.out.println("x^2+y^2-|z| =" +((x+y)-z));
*/











    }
}
