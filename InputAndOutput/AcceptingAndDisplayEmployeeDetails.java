package InputAndOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingAndDisplayEmployeeDetails
{
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Id: ");
        int id=Integer.parseInt(br.readLine());

        System.out.print("Enter Sex (M/F): ");
        //char sex=(char)br.read(); // Solution1:  char sex=(char)br.readLine().charAt(0);
        char sex=(char)br.readLine().charAt(0);
       // br.skip(1); //Solution2: Skip 1 characters.

        System.out.print("Enter Name: ");
        String name=br.readLine();

        System.out.println("Id: "+id);
        System.out.println("Sex: "+sex);
        System.out.println("Name: "+name);

    }
}
