package InputAndOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingIntegerValueFormKeyboard
{
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number: ");
        int num=Integer.parseInt(br.readLine());

        System.out.println("You entered number:" +num);

    }
}
