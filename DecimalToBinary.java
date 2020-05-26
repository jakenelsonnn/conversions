//asks user for a number in decimal and returns it in binary.

import java.util.Scanner;

public class DecimalToBinary
{   
    public static void main (String args[])
    {
        while(true)
        {
            System.out.println("Please enter an integer to return its value in binary.");
            Scanner inp = new Scanner(System.in);
            int dec = inp.nextInt();
            int[] binary = new int[1000];

            int i = 0;
            while(dec > 0)
            {
                binary[i] = dec % 2;
                dec = dec / 2;
                i++;
            }
        
            //array must be printed in reverse order
            for(int j = i - 1; j >= 0; j--)
            {
               System.out.print(binary[j]);
            }
            System.out.println();
        }
    }
}