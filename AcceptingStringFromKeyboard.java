package InputAndOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AcceptingStringFromKeyboard
{
    public static void main(String args[]) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a name : ");
        String name=br.readLine();

        System.out.println("You entered: "+name);



    }
}
