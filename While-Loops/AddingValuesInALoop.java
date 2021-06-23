import java.util.Scanner;

public class AddingValuesInALoop
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);

    System.out.println("I will add up the numbers you give me.");
    System.out.print("Number: ");
    int num = keyboard.nextInt();
    int sum = 0;

    while (num != 0)
    {
      sum += num;
      System.out.println("The total so far is " + sum);
      System.out.print("Number: ");
      num = keyboard.nextInt();
    }

    System.out.println("\nThe total is " + sum);
  }
}
