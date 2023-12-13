// Program to print Multiplication Table


import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String args[])
    {
         System.out.println("Enter the number to print Multiplication table : ");
         Scanner reader = new Scanner(System.in);
         int number;
         number = reader.nextInt();
         
         for( int i=1; i<=10; i++)
         {
              int result = number * i;
              System.out.println( number + " * " + i + " =  " + result );
            
         }

    }

}