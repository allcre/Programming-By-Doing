import java.util.Scanner;

public class BabyNim
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);
    int aPile = 3;
    int bPile = 3;
    int cPile = 3;

    System.out.println("A: 3\tB: 3\tC: 3");

    while (aPile > 0 || bPile > 0 || cPile > 0)
    {
      System.out.print("\nChoose a pile: ");
      String pile = keyboard.next();
      System.out.print("How many to remove from pile " + pile + ": ");
      int remove = keyboard.nextInt();

      if (pile.equals("A"))
        aPile -= remove;

      else if (pile.equals("B"))
        bPile -= remove;

      else if (pile.equals("C"))
        cPile -= remove;

      System.out.println("\nA: " + aPile + "\tB: " + bPile + "\tC: " + cPile);
    }

    System.out.println("\nAll piles are empty. Good job!");
  }
}
