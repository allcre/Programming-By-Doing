import java.util.Scanner;

public class Nim
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);

    System.out.print("Player 1, enter your name: ");
    String name1 = keyboard.next();
    System.out.print("Player 2, enter your name: ");
    String name2 = keyboard.next();

    int aPile = 3;
    int bPile = 4;
    int cPile = 5;
    int turn = 1;
    String name = "";
    int amount = 0;
    int i;

    i = 5;
    System.out.println();

    while (i > 0)
    {
      if (aPile - i < 0)
        System.out.print("\t  ");
      else if (aPile - i >= 0)
        System.out.print("\t* ");

      if (bPile - i < 0)
        System.out.print("  ");
      else if (bPile - i >= 0)
        System.out.print("* ");

      if (cPile - i < 0)
        System.out.print("  ");
      else if (cPile - i >= 0)
        System.out.print("* ");

      System.out.print("\n");
      i--;
    }

    System.out.print("\tA B C");

    while ((aPile + bPile + cPile) > 1)
    {
      if (turn == 1)
      {
        name = name1;
        turn = 2;
      }
      else if (turn == 2)
      {
        name = name2;
        turn = 1;
      }

      System.out.print("\n\n" + name + ", choose a pile: ");
      String pile = keyboard.next();

      while ((aPile == 0 && pile.equals("A")) || (bPile == 0 && pile.equals("B")) || (cPile == 0 && pile.equals("C")))
      {
        System.out.print("Nice try, " + name + ". That pile is empty. Choose again: ");
        pile = keyboard.next();
      }

      System.out.print("How many to remove from pile " + pile + ": ");
      int remove = keyboard.nextInt();

      if (pile.equals("A"))
        amount = aPile;

      else if (pile.equals("B"))
        amount = bPile;

      else if (pile.equals("C"))
        amount = cPile;

      while ((remove < 1) || (remove > amount))
      {
        if (remove < 1)
          System.out.print("\nYou must choose at least 1.");

        else if (remove > amount)
          System.out.print("\nPile " + pile + " doesn't have that many.");

        System.out.print(" Try again: ");
        remove = keyboard.nextInt();
      }

      if (pile.equals("A"))
        aPile -= remove;

      else if (pile.equals("B"))
        bPile -= remove;

      else if (pile.equals("C"))
        cPile -= remove;

      i = 5;
      System.out.println();

      while (i > 0)
      {
        if (aPile - i < 0)
          System.out.print("\t  ");
        else if (aPile - i >= 0)
          System.out.print("\t* ");

        if (bPile - i < 0)
          System.out.print("  ");
        else if (bPile - i >= 0)
          System.out.print("* ");

        if (cPile - i < 0)
          System.out.print("  ");
        else if (cPile - i >= 0)
          System.out.print("* ");

        System.out.print("\n");
        i--;
      }

      System.out.print("\tA B C");
    }

    if (turn == 1)
      name = name1;
    else if (turn == 2)
      name = name2;

    if (name == name1)
      System.out.println("\n\n" + name + ", you must take the last remaining counter, so you lose. " + name2 + " wins!");

    else if (name == name2)
      System.out.println("\n\n" + name + ", you must take the last remaining counter, so you lose. " + name1 + " wins!");
  }
}
