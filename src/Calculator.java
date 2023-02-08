/*
 * Chris Anzilotti
 * Calculator Program
 * 2/8/2023
 */

import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args) throws Exception 
    {
        //Global Variables
        int addition;
        int subtraction;

        Scanner scan = new Scanner(System.in);
        //Asking for operation
        System.out.println("Enter a number for either Addition or Subtraction: ");
        System.out.println("1. Addition  2. Subtraction");
        int check = scan.nextInt();

        //Getting integer values
        System.out.println("Enter two integers: ");
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();

        if(check == 1)
        {
            addition = firstNum + secondNum;
            System.out.printf("The sum is %d", addition);
        }
        if(check == 2)
        {
            subtraction = firstNum - secondNum;
            System.out.printf("The difference is %d", subtraction);
        }

        
        scan.close();
    }
}
