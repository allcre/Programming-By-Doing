import java.util.Random;

public class BasicArrays2
{
  public static void main (String args[])
  {
    Random r = new Random();
    int[] array = new int[10];

    for (int i = 0; i < array.length; i++)
    {
      array[i] = 1 + r.nextInt(100);
      System.out.println("Slot " + i + " contains a " + array[i]);
    }
  }
}
