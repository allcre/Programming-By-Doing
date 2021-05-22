import java.util.Scanner;

public class ADumbCalculator
{
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner (System.in);

    double x1, x2, x3, answer;

    System.out.print("What is your first number? ");
    x1 = keyboard.nextDouble();

    System.out.print("What is your second number? ");
    x2 = keyboard.nextDouble();

    System.out.print("What is your third number? ");
    x3 = keyboard.nextDouble();

    answer = (x1 + x2 + x3) / 2;

    System.out.println("\n( " + x1 + " + " + x2 + " + " + x3 + " ) / 2 is... " + answer);
  }
}
