import java.util.Scanner;

public class WorstGuessing
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);

    int num = 69;
    int guess;

    System.out.println("lol good luck beating this game");
    System.out.print("guess 1-100 rn ");
    guess = keyboard.nextInt();

    if (guess == num)
      System.out.println("\nSHEEEEESH ur too good");

    else
      System.out.println("\nur bad. it was " + num + " lol.");
  }
}
