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
        int finalVal;

        Scanner scan = new Scanner(System.in);
        //Asking for operation
        System.out.println("Enter a number for either Addition, Subtraction, Multiplication, Division: ");
        System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Divisoin");
        int check = scan.nextInt();

        //Getting integer values
        System.out.println("Enter two integers: ");
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();

        if(check == 1)
        {
            finalVal = firstNum + secondNum;
            System.out.printf("The sum is %d", finalVal);
        }
        if(check == 2)
        {
            finalVal = firstNum - secondNum;
            System.out.printf("The difference is %d", finalVal);
        }
        if(check == 3)
        {
            finalVal = firstNum * secondNum;
            System.out.printf("The product is %d", finalVal);
        }
        if(check == 4)
        {
            finalVal = firstNum / secondNum;
            System.out.printf("The quotient is %d", finalVal);
        }

        
        scan.close();
    }
}
