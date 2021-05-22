import java.util.Scanner;

public class LittleQuiz
{
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner (System.in);

    int a1, a2, a3, i1, i2, i3, score;
    a1 = 3;
    a2 = 2;
    a3 = 2;
    score = 0;

    System.out.print("Are you ready for a quiz? ");
    keyboard.next();
    System.out.println("Okay, here it comes!");

    System.out.println("\n Q1) What is the capital of Alaska?");
    System.out.println("  1) Melbourne");
    System.out.println("  2) Anchorage");
    System.out.println("  3) Juneau");

    System.out.print("\n> ");
    i1 = keyboard.nextInt();

    if (i1 == a1)
    {
      System.out.println("\nThat's right!");
      score++;
    }
    else
    {
      System.out.println("\nBrush up on your geography skills");
    }

    System.out.println("\nQ2) Can you store the value \"cat\" in a variable of type int?");
    System.out.println("  1) Yes");
    System.out.println("  2) No");

    System.out.print("\n> ");
    i2 = keyboard.nextInt();

    if (i2 == a2)
    {
      System.out.println("\nThat's right!");
      score++;
    }
    else
    {
      System.out.println("\nSorry, \"cat\" is a string. ints can only store numbers.");
    }

    System.out.println("\nQ3) What is the result of 9+6/3?");
    System.out.println("  1) 5");
    System.out.println("  2) 11");
    System.out.println("  3) 15/3");

    System.out.print("\n> ");
    i3 = keyboard.nextInt();

    if (i3 == a3)
    {
      System.out.println("\nThat's correct!");
      score++;
    }
    else
    {
      System.out.println("\nPEDMAS!");
    }

    System.out.println("\nOverall, you got " + score + " out of 3 correct.");
    System.out.println("Thanks for playing!");
  }
}
