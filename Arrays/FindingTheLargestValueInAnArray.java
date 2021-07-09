import java.util.Random;

public class FindingTheLargestValueInAnArray
{
  public static void main (String args[])
  {
    Random r = new Random();
    int largest = 0;

    int[] array = new int[10];

    System.out.print("Array: ");

    for (int i = 0; i < array.length; i++)
    {
      array[i] = 1 + r.nextInt(100);
      System.out.print(array[i] + " ");

      if (array[i] > largest)
        largest = array[i];
    }

    System.out.println("\nThe largest value is " + largest);
  }
}
