package InputAndOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class AcceptingDifferentTypesOfInputInaLine
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Name, Age, Salary: ");

        String str=br.readLine(); //accept input into a string

        //use StringTokenizer to split input at commas
        StringTokenizer token=new StringTokenizer(str,",");

        //we will have 3 tokens as strings: 1st token as name, 2nd one age, 3rd one salary
        String s1=token.nextToken();
        String s2=token.nextToken();
        String s3=token.nextToken();

        //trim any space before and after the tokens
        s1=s1.trim();
        s2=s2.trim();
        s3=s3.trim();

        //convert string s1 into string, s2 into integer and s3 into float
        String name=s1;
        int age=Integer.parseInt(s2);
        float sal=Float.parseFloat(s3);

        //Display entered data
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+sal);

    }
}
