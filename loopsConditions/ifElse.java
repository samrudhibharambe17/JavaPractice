package loopsConditions;

public class ifElse
{
    public static void main(String[] args)
{
     int a=10;
     int b=50;
     int c=30;

     if(a>b && a>c)
     {
           System.out.println(a);
     }else if(a>c)
     {
         System.out.println(a);
     }else if(b>a)
     {
         System.out.println(b);
     }else if(b>c)
     {
         System.out.println(b);
     }else{
         System.out.println(c);
     }

}
}
