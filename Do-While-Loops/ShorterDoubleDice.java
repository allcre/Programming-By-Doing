import java.util.Random;

public class ShorterDoubleDice
{
  public static void main (String args[])
  {
    Random r = new Random();
    int r1, r2;

    System.out.println("HERE COMES THE DICE!\n");

    do {
      r1 = 1 + r.nextInt(6);
      r2 = 1 + r.nextInt(6);
      int sum = r1 + r2;

      System.out.println("Roll #1: " + r1);
      System.out.println("Roll #2: " + r2);
      System.out.println("The total is " + sum + "!\n");
    } while (r1 != r2);
  }
}
