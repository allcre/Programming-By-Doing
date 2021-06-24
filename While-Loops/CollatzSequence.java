import java.util.Scanner;

public class CollatzSequence
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);

    System.out.print("Starting number: ");
    int num = keyboard.nextInt();
    int steps = 0;
    int max = num;

    System.out.print(num + "\t");

    while (num != 1)
    {
      if (num % 2 == 0)
        num = num / 2;

      else
        num = num * 3 + 1;

      if (num > max)
        max = num;

      steps++;
      System.out.print(num + "\t");
    }

    System.out.println("\n\nTerminated after " + steps + " steps. The largest value was " + max + ".");
  }
}
