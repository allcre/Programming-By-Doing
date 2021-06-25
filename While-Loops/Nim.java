import java.util.Scanner;
import java.util.Random;

public class Nim
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);
    Random r = new Random();

    int aPile = 3;
    int bPile = 4;
    int cPile = 5;
    String pile = "";
    int remove;
    int turn = 1;
    String name = "";
    int amount = 0;
    int i;

    System.out.println("Hello! Welcome to Nim.");
    System.out.println("The game works by removing at least 1 counter from any pile on your turn. The player who is forced to take the last counter loses.");
    System.out.print("Will there be 1 or 2 players today: ");
    int players = keyboard.nextInt();

    if (players == 1)
    {
      System.out.print("\nPlease enter your name: ");
      name = keyboard.next();
      System.out.println("You'll be playing against Bartholomew today.");

      int starter = 1 + r.nextInt(2);
      int winning = 0;

      if (starter == 1)
      {
        System.out.println("Bartholomew will be going first.");
        turn = 1;
      }

      else if (starter == 2)
      {
        System.out.println("You'll be going first.");
        turn = 2;
      }

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
        if (turn % 2 != 0)
        {
          do {
            int randomPile = 1 + r.nextInt(3);

            if (randomPile == 1)
            {
              amount = aPile;
              pile = "A";
            }

            else if (randomPile == 2)
            {
              amount = bPile;
              pile = "B";
            }

            else if (randomPile == 3)
            {
              amount = cPile;
              pile = "C";
            }

          } while (amount == 0);

          remove = 1 + r.nextInt(amount);

          System.out.println("\n\nBartholomew removed " + remove + " counter(s) from pile " + pile);

          if (pile.equalsIgnoreCase("A"))
            aPile -= remove;

          else if (pile.equalsIgnoreCase("B"))
            bPile -= remove;

          else if (pile.equalsIgnoreCase("C"))
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

          turn++;
        }

        else if (turn % 2 == 0)
        {
          System.out.print("\n\n" + name + ", choose a pile: ");
          pile = keyboard.next();

          while ((aPile == 0 && pile.equalsIgnoreCase("A")) || (bPile == 0 && pile.equalsIgnoreCase("B")) || (cPile == 0 && pile.equalsIgnoreCase("C")))
          {
            System.out.print("Nice try, " + name + ". That pile is empty. Choose again: ");
            pile = keyboard.next();
          }

          System.out.print("How many to remove from pile " + pile + ": ");
          remove = keyboard.nextInt();

          if (pile.equalsIgnoreCase("A"))
            amount = aPile;

          else if (pile.equalsIgnoreCase("B"))
            amount = bPile;

          else if (pile.equalsIgnoreCase("C"))
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

          if (pile.equalsIgnoreCase("A"))
            aPile -= remove;

          else if (pile.equalsIgnoreCase("B"))
            bPile -= remove;

          else if (pile.equalsIgnoreCase("C"))
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

          turn++;
        }
      }

      if (turn % 2 != 0)
      {
        if (aPile + bPile + cPile == 0)
          System.out.println("\n\nOops... you took all the counters so you lose :(");

        else
          System.out.println("\n\nBartholomew has to take the last counter, so you win!");
      }

      else
      {
        if (aPile + bPile + cPile == 0)
          System.out.println("\n\nBartholomew took all the counters... you win!");

        else
          System.out.println("\n\n" + name + ", you have to take the last counter so Bartholomew wins.");
      }
    }


    else if (players == 2)
    {
      System.out.print("\nPlayer 1, enter your name: ");
      String name1 = keyboard.next();
      System.out.print("Player 2, enter your name: ");
      String name2 = keyboard.next();

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
        pile = keyboard.next();

        while ((aPile == 0 && pile.equalsIgnoreCase("A")) || (bPile == 0 && pile.equalsIgnoreCase("B")) || (cPile == 0 && pile.equalsIgnoreCase("C")))
        {
          System.out.print("Nice try, " + name + ". That pile is empty. Choose again: ");
          pile = keyboard.next();
        }

        System.out.print("How many to remove from pile " + pile + ": ");
        remove = keyboard.nextInt();

        if (pile.equalsIgnoreCase("A"))
          amount = aPile;

        else if (pile.equalsIgnoreCase("B"))
          amount = bPile;

        else if (pile.equalsIgnoreCase("C"))
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

        if (pile.equalsIgnoreCase("A"))
          aPile -= remove;

        else if (pile.equalsIgnoreCase("B"))
          bPile -= remove;

        else if (pile.equalsIgnoreCase("C"))
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

      if (turn == 1 && aPile + bPile + cPile != 0)
        System.out.println("\n\n" + name + ", you must take the last remaining counter, so you lose. " + name2 + " wins!");

      else if (turn == 1)
        System.out.println("\n\n" + name + ", " + name2 + " took all the reamaining counters, so you win!");


      else if (turn == 2 && aPile + bPile + cPile != 0)
        System.out.println("\n\n" + name + ", you must take the last remaining counter, so you lose. " + name1 + " wins!");

      else if (turn == 2)
        System.out.println("\n\n" + name + ", " + name1 + " took all the reamaining counters, so you win!");
    }
  }
}
