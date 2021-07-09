import java.util.Scanner;
import java.util.Random;

public class FindingAValueInAnArray
{
  public static void main (String args[])
  {
    Random r = new Random();
    Scanner kb = new Scanner(System.in);

    int[] array = new int[10];

    System.out.print("Array: ");

    for (int i = 0; i < array.length; i++)
    {
      array[i] = 1 + r.nextInt(50);
      System.out.print(array[i] + " ");
    }

    System.out.print("\nValue to find: ");
    int num = kb.nextInt();

    for (int i = 0; i < array.length; i++)
    {
      if (array[i] == num)
        System.out.println("\n" + num + " is in the array.");
    }
  }
}
