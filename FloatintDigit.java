import java.util.Scanner;
import java.lang.Math;

public class FloatintDigit
{
      public static void main(String args[])
      {
           Scanner reader = new Scanner(System.in);
           System.out.println("Enter first number: ");
           double n1 = reader.nextDouble();
            
           System.out.println("Enter second number: ");
           double n2 = reader.nextDouble();
              reader.close();
           if (Math.abs(n1 - n2) <= 0.001)
           {
                System.out.println("Entered both numbers are same ");
           } 
           else           
           {
                System.out.println("Entered both numbers are different ");
           }
      }
}