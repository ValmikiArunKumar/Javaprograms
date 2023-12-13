// Program to print the factorial  of a number

import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
         System.out.println("Enter the number : ");
         Scanner reader = new Scanner(System.in);
         int num;
         num = reader.nextInt();
         
         int fact = 1;
         if(num == 0)
         {
             System.out.println("Factorial of" + num + " is " + fact);
         }
         else if(num > 0)
         {
             for( int i=1; i<=num; i++)
             {
                 fact =fact * i;
             }
             System.out.println("Factorail of num is" + fact);
     
         }
         else
         {
             System.out.println("Entered number is Invalid");
         }
    }

}