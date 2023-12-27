// Program to swap two given numbers

import java.util.Scanner;

public class SwapTwo
{
    public static void main(String args[])
      {
          Scanner reader = new Scanner(System.in);
          System.out.print("\nEnter the first number: ");
          int FirstNumber = reader.nextInt();    
          System.out.print("\nEnter the second number: ");
          int SecondNumber = reader.nextInt();
          reader.close();
	  int temp = FirstNumber;
          FirstNumber = SecondNumber ;
          SecondNumber  = temp;
          System.out.print("Swaped numbers are: First number = " + FirstNumber + " Second number: " +  SecondNumber);    
      }
}