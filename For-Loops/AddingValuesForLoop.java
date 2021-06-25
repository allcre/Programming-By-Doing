import java.util.Scanner;

public class AddingValuesForLoop
{
  public static void main (String args[])
  {
    Scanner kb = new Scanner (System.in);

    System.out.print("Number: ");
    int n = kb.nextInt();
    int sum = 0;

    for (int i = 1; i <= n; i++)
    {
      System.out.print(i + " ");
      sum += i;
    }

    System.out.println("\nThe sum is " + sum + ".");
  }
}
