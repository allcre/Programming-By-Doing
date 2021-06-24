import java.util.Scanner;

public class RightTriangleChecker
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);

    System.out.println("Enter three integers:");
    int s1, s2, s3;

    System.out.print("Side 1: ");
    s1 = keyboard.nextInt();

    do {
      System.out.print("Side 2: ");
      s2 = keyboard.nextInt();

      if (s2 < s1)
        System.out.println(s2 + " is smaller than " + s1 + ". Try again.");
    } while (s2 < s1);

    do {
      System.out.print("Side 3: ");
      s3 = keyboard.nextInt();

      if (s3 < s2)
        System.out.println(s3 + " is smaller than " + s2 + ". Try again.");
    } while (s3 < s2);

    boolean triangleCheck = Math.pow(s3, 2) == (Math.pow(s1, 2) + Math.pow(s2, 2));

    System.out.println("Your three sides are " + s1 + " " + s2 + " " + s3);

    if (triangleCheck)
      System.out.println("These sides *do* make a right triangle. Yippy-skippy!");

    else
      System.out.println("NO! These sides do not make a right triangle!");
  }
}
