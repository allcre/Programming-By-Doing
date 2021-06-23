import java.util.Scanner;
import java.util.Random;

public class HiLoLimited
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);
    Random r = new Random();

    int num  = 1 + r.nextInt(100);
    int tries = 0;

    System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
    System.out.print("First guess: ");
    int guess = keyboard.nextInt();
    tries++;

    while (guess != num && tries < 7)
    {
      if (guess > num)
        System.out.println("Sorry, you are too high.");

      else if (guess < num)
        System.out.println("Sorry, you are too low.");

      System.out.print("Guess #" + (tries + 1) + ": ");
      guess = keyboard.nextInt();
      tries++;
    }

    if (guess == num)
      System.out.println("You guessed it! What are the odds?!?");

    else if (tries >= 7)
      System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
  }
}
