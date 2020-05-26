//prompts user for binary number and returns it in decimal

import java.util.Scanner;

public class BinaryToDecimal
{
    public static void main(String args[])
    {
        while(true)
        {
            System.out.println("Please enter a binary number.");
            Scanner inp = new Scanner(System.in);
            int binary = inp.nextInt();
            int decimal = 0;
        
            int base = 1;
        
            int temp = binary;
            while (temp > 0)
            {
                int lastDigit = temp % 10;
                temp = temp / 10;   //dividing the number by 10 removes the last digit
            
                decimal += lastDigit * base;
            
                base = base * 2;
            }
        
            System.out.println("Decimal Value: " + decimal);
        }

    }
}