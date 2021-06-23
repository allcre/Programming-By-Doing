import java.util.Scanner;
import java.util.Random;

public class AgainWithTheNumberGuessing
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);
    Random r = new Random();

    int num = 1 + r.nextInt(10);
    int guess;
    int tries = 0;

    System.out.println("lol good luck beating this game");
    System.out.print("Try to guess ");

    do {
      System.out.print("> ");
      guess = keyboard.nextInt();
      if (guess != num)
        System.out.println("\nur bad. guess again.");
      tries++;
    } while (guess != num);

    System.out.println("\nSHEEEEESH ur too good. it only took you " + tries + " tries.");
  }
}
