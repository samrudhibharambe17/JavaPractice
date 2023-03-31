package InputAndOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingOtherTypeOfValuesFromKeyboard
{
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //Accepting a Float value form keyboard
        System.out.print("Enter float value: ");
        float n1=Float.parseFloat(br.readLine());
        System.out.println("You entered float value :"+n1);

        //Accepting a Double value form keyboard
        System.out.print("Enter double value: ");
        double n2=Double.parseDouble(br.readLine());
        System.out.println("You entered double value:"+n2);

        //Accepting a Byte value form keyboard
        System.out.print("Enter byte value: ");
        byte n3=Byte.parseByte(br.readLine());
        System.out.println("You entered byte value:"+n3);

        //Accepting a Short value form keyboard
        System.out.print("Enter short value: ");
        short n4=Short.parseShort(br.readLine());
        System.out.println("You entered double value:"+n4);

        //Accepting a Long value form keyboard
        System.out.print("Enter long value: ");
        long n5=Long.parseLong(br.readLine());
        System.out.println("You entered long value:"+n5);

        //Accepting a Boolean value form keyboard
        System.out.print("Enter double value: ");
        boolean n6=Boolean.parseBoolean(br.readLine());
        System.out.println("You entered boolean value:"+n6);

    }
}
