// note: == does not work for comparing a variable and a string. Use .equals() instead.
// also {} are not needed for one line if/else statements. They can be omitted. 

import java.util.Scanner;

public class TwentyQuestions
{
  public static void main(String args[])
  {
    Scanner keyboard = new Scanner (System.in);

    String a1, a2, guess;
    guess = "";

    System.out.println("TWO QUESTIONS!");
    System.out.println("Think of an object, and I'll try to guess it.");
    System.out.println("\nQuestion 1) Is it an animal, vegetable, or mineral?");
    System.out.print("> ");

    a1 = keyboard.next();

    System.out.println("\n\nQuestion 2) Is it bigger than a breadbox?");
    System.out.print("> ");

    a2 = keyboard.next();

    if (a1.equals("animal"))
    {
      if (a2.equals("yes"))
      {
        guess = "moose";
      }

      else
      {
        guess = "squirrel";
      }
    }

    if (a1.equals("vegetable"))
    {
      if (a2.equals("yes"))
      {
        guess = "watermelon";
      }

      else
      {
        guess = "carrot";
      }
    }

    if (a1.equals("mineral"))
    {
      if (a2.equals("yes"))
      {
        guess = "Camaro";
      }

      else
      {
        guess = "paper clip";
      }
    }

    System.out.println("\n\nMy guess is that you are thinking of a " + guess + ".");
    System.out.println("I would ask you if I'm right, but I don't actually care.");
  }
}
