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
        Scanner scan = new Scanner(System.in);
        //Asking for operation
        System.out.println("Enter a number for either Addition, Subtraction, Multiplication, Division: ");
        System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
        int check = scan.nextInt();

        //Getting integer values
        System.out.println("Enter two integers: ");
        double firstNum = scan.nextDouble();
        double secondNum = scan.nextDouble();

        //Doing the selected
        double finalVal;
        if(check == 1)
        {
            finalVal = firstNum + secondNum;
            System.out.printf("The sum is %f", finalVal);
        }
        if(check == 2)
        {
            finalVal = firstNum - secondNum;
            System.out.printf("The difference is %f", finalVal);
        }
        if(check == 3)
        {
            finalVal = firstNum * secondNum;
            System.out.printf("The product is %f", finalVal);
        }
        if(check == 4)
        {
            finalVal = firstNum / secondNum;
            System.out.printf("The quotient is %f", finalVal);
        }

        
        scan.close();
    }
}
