import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);
    Random r  = new Random();

    int ace = 1 + r.nextInt(3);

    System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
    System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
    System.out.println("He lays down three cards.\n");
    System.out.println("Which one is the ace?\n");

    System.out.println("\t##  ##  ##\n\t##  ##  ##\n\t1   2   3\n");

    System.out.print("> ");
    int guess = keyboard.nextInt();

    if (guess == ace)
      System.out.println("\nYou nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n");

    else
      System.out.println("\nHa! Fast Eddie wins again! The ace was card number " + ace + ".\n");

    if (ace == 1)
      System.out.println("\tAA  ##  ##\n\tAA  ##  ##\n\t1   2   3\n");

    else if (ace == 2)
      System.out.println("\t##  AA  ##\n\t##  AA  ##\n\t1   2   3\n");

    else
      System.out.println("\t##  ##  AA\n\t##  ##  AA\n\t1   2   3\n");
  }
}
