import java.util.Scanner;

public class CountingMachineRevisited
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);

    System.out.print("Count from: ");
    int start = keyboard.nextInt();

    System.out.print("Count to  : ");
    int end = keyboard.nextInt();

    System.out.print("Count by  : ");
    int interval = keyboard.nextInt();

    for (int i = start; i <= end; i += interval)
    {
      System.out.print(i + " ");
    }
  }
}
