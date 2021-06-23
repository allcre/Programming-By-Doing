import java.util.Scanner;

public class SafeSquareRoot
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);
    double num = 0;

    System.out.println("SQUARE ROOT!");

    do {
      System.out.print("Enter a number: ");
      num = keyboard.nextDouble();

      if (num < 0)
        System.out.println("You can't take the square root of a negative number, silly.");

      else
        System.out.println("The square root of " + num + " is " + Math.sqrt(num) + ".");

    } while (num < 0);
  }
}
