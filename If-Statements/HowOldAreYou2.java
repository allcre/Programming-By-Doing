import java.util.Scanner;

public class HowOldAreYou2
{
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner (System.in);

    String name, msg;
    int age;

    System.out.print("Hey, what's your name? (Sorry I keep forgetting.) ");
    name = keyboard.next();

    System.out.print("Ok, " + name + ", how old are you? ");
    age = keyboard.nextInt();

    if (age < 16)
    {
      msg = "You can't drive";
    }
    else if (age <= 17)
    {
      msg = "You can drive but not vote";
    }
    else if (age <= 24)
    {
      msg = "You can vote but not rent a car";
    }
    else
    {
      msg = "You can pretty much do anything";
    }

    System.out.println("\n" + msg + ", " + name +".");
  }
}
