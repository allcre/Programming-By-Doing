import java.util.Scanner;
import java.util.Random;

public class NumberGuessingWithACounter
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);
    Random r = new Random();

    int num = 1 + r.nextInt(10);
    int guess;
    int tries = 0;

    System.out.println("lol good luck beating this game");
    System.out.print("guess 1-10 rn: ");
    guess = keyboard.nextInt();
    tries++;

    while (guess != num)
    {
      System.out.println("\nur bad. guess again.");
      System.out.print("> ");
      guess = keyboard.nextInt();
      tries++;
    }

    System.out.println("\nSHEEEEESH ur too good. it only took you " + tries + " tries.");
  }
}
