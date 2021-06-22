import java.util.Scanner;

public class TwoMoreQuestions
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);
    String a1, a2, guess;
    guess = "";

    System.out.println("TWO MORE QUESTIONS, BABY!\n");
    System.out.println("Think of something and I'll try to guess it!\n");
    System.out.print("Question 1) Does it stay inside or outside or both? ");
    a1 = keyboard.next();

    System.out.print("Question 2) Is it a living thing? ");
    a2 = keyboard.next();

    if (a1.equals("inside") && a2.equals("yes"))
      guess = "houseplant";

    if (a1.equals("inside") && a2.equals("no"))
      guess = "shower curtain";

    if (a1.equals("outside") && a2.equals("yes"))
      guess = "bison";

    if (a1.equals("outside") && a2.equals("no"))
      guess = "billboard";

    if (a1.equals("both") && a2.equals("yes"))
      guess = "dog";

    if (a1.equals("both") && a2.equals("no"))
      guess = "cell phone";

    System.out.println("\nThen what else could you be thinking of besides a " + guess + "!?!");
  }
}
