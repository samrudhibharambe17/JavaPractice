package InputAndOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingSingleCharInputFromKeyboard
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a character: ");
        char ch = (char) br.read();

        System.out.println("Your entered: " + ch);
    }
}
