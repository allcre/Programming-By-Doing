import java.util.Scanner;
import java.util.Random;

public class IsItThereOrNot
{
  public static void main (String args[])
  {
    Random r = new Random();
    Scanner kb = new Scanner(System.in);
    boolean present = false;

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
        present = true;
    }

    if (present)
      System.out.println("\n" + num + " is in the array.");
    else
      System.out.println("\n" + num + " is not in the array.");
  }
}
