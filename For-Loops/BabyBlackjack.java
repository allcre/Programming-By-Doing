import java.util.Random;

public class BabyBlackjack
{
  public static void main (String args[])
  {
    Random r = new Random();

    System.out.println("Baby Blackjack!\n");

    int you1 = 1 + r.nextInt(10);
    int you2 = 1 + r.nextInt(10);
    int youSum = you1 + you2;

    int dealer1 = 1 + r.nextInt(10);
    int dealer2 = 1 + r.nextInt(10);
    int dealerSum = dealer1 + dealer2;

    System.out.println("Your drew " + you1 + " and " + you2 + ".");
    System.out.println("Your total is " + youSum + ".\n");

    System.out.println("The dealer has " + dealer1 + " and " + dealer2 + ".");
    System.out.println("Dealer's total is " + dealerSum + ".\n");

    if (youSum > dealerSum)
      System.out.println("YOU WIN!");

    else
      System.out.println("Dealer wins.");
  }
}
