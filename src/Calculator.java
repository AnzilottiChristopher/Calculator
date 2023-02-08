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
        System.out.println("Enter two integers: ");
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        int finalNum = secondNum + firstNum;
        System.out.printf("The sum is %d", finalNum);
        scan.close();
    }
}
